# RestaurantOrderSystem
This Java program serves as a command-line restaurant order system designed for educational purposes, with a focus on teaching basic Object-Oriented Programming (OOP) concepts using Java.


## Classes

#### Customer

```java
public class Customer {
    private String customerName;
    private String address;

    public Customer(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }

    // Getters and setters...
}
```
#### Menu

```java
public class Menu {
    private String menuName;
    private float price;

    public Menu(String menuName, float price) {
        this.menuName = menuName;
        this.price = price;
    }

    // Getters and setters...
}
```

#### OrderDetails
(OrderDetails class is assumed to exist based on the usage in the main class.)

### Usage
The DriverQ1 class serves as the main program, providing a hands-on learning experience for basic Object-Oriented Programming (OOP) concepts in Java. Use this code to understand fundamental OOP principles, such as classes, encapsulation, and abstraction.

### Questions:
### What is the purpose of this code?
##### The code simulates a restaurant order system using Java, emphasizing basic Object-Oriented Programming (OOP) concepts.

#### 1 ) What are the key classes in the program, and what do they represent?

The program consists of classes such as Customer, Menu, and OrderDetails. The Customer class represents customer information, the Menu class represents menu items, and the OrderDetails class handles order-related details.

#### 2 ) How does the program use Object-Oriented Programming (OOP) principles?

The code utilizes OOP principles by defining classes, encapsulating data within objects, and demonstrating the relationship between different classes.

#### 3 ) What is the main functionality of the DriverQ1 class?

The DriverQ1 class serves as the entry point for the program, allowing users to interact with the restaurant order system by selecting menus, inputting customer details, and viewing order summaries.

### Contributing
Contributions are welcome! If you have suggestions, improvements, or bug fixes, feel free to create a pull request. Let's enhance this educational resource together.
