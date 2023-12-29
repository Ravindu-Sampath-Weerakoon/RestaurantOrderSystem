import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriverQ1 {
    public static void main(String[] args) {
        Menu[] menus = {
                new Menu("Three-course", 3000),
                new Menu("Five-course", 5000),
                new Menu("Vegetarian", 2500)
        };

        List<Customer> customerList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("This is a menu:");
            for (int i = 0; i < menus.length; i++) {
                System.out.println("\t" + (i + 1) + ". " + menus[i].getMenuName());
            }
            System.out.println("\t0. Exit program");

            System.out.print("Select a menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Exiting the program...");
                break;
            }

            if (choice < 1 || choice > menus.length) {
                System.out.println("Invalid menu selection. Please try again.\n");
                continue;
            }

            System.out.println("Are you a new customer? (y/n)");
            String isNewCustomer = scanner.nextLine();

            if (isNewCustomer.equalsIgnoreCase("y")) {
                System.out.print("Enter customer name: ");
                String customerName = scanner.nextLine();

                System.out.print("Enter customer address: ");
                String customerAddress = scanner.nextLine();

                Customer customer = new Customer(customerName, customerAddress);
                customerList.add(customer);

                OrderDetails order = new OrderDetails(customer, menus[choice - 1]);

                System.out.println("\nOrder Details:");
                System.out.println("Customer Name: " + order.getCustomer().getCustomerName());
                System.out.println("Customer Address: " + order.getCustomer().getAddress());
                System.out.println("Menu: " + order.getMenu().getMenuName());
                System.out.println("Price: " + NumberFormat.getCurrencyInstance().format(order.getMenu().getPrice()) + "\n");
            } else {
                if (customerList.isEmpty()) {
                    System.out.println("No existing customer information found. Please provide new customer details.\n");
                    continue;
                }

                System.out.println("Existing Customers:");
                for (int i = 0; i < customerList.size(); i++) {
                    System.out.println((i + 1) + ". " + customerList.get(i).getCustomerName());
                }

                System.out.print("Select a customer: ");
                int customerChoice = scanner.nextInt();
                scanner.nextLine();

                if (customerChoice < 1 || customerChoice > customerList.size()) {
                    System.out.println("Invalid customer selection. Please try again.\n");
                    continue;
                }

                Customer customer = customerList.get(customerChoice - 1);

                OrderDetails order = new OrderDetails(customer, menus[choice - 1]);

                System.out.println("\nOrder Details:");
                System.out.println("Customer Name: " + order.getCustomer().getCustomerName());
                System.out.println("Customer Address: " + order.getCustomer().getAddress());
                System.out.println("Menu: " + order.getMenu().getMenuName());
                System.out.println("Price: " + order.getMenu().getPrice() + "\n");
            }
        }

        scanner.close();
    }
}
