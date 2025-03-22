package Products;

import java.util.Scanner;

public class Product {
    protected String name;
    protected double price;
    protected int stockQuantity;

    public Product (String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void inputDetails() {
        Scanner productScanner = new Scanner(System.in);
        System.out.println("Enter product name: ");
        this.name = productScanner.nextLine();

        System.out.println("Enter product price: ");
        this.price = productScanner.nextDouble();

        System.out.println("Enter product quantity: ");
        this.stockQuantity = productScanner.nextInt();
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Current Quantity: " + stockQuantity);
    }
}
