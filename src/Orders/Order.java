package Orders;

import Users.Customer;
import Products.Product;
import java.util.Scanner;

public class Order {
    private int orderID;
    private Customer customer;
    private Product product;
    private double totalPrice;

    public static void main(String[] args) {
        Order newOrder = new Order(0, null, null, 0.0);
        newOrder.inputDetails();
        newOrder.generateInvoice();
    }

    public Order(int orderID, Customer customer, Product product, double totalPrice) {
        this.orderID = orderID;
        this.customer = customer;
        this.product = product;
        this.totalPrice = totalPrice;
    }

    public void inputDetails() {
        Scanner orderScanner = new Scanner(System.in);

        System.out.println("Enter orderID (8 digits): ");
        this.orderID = orderScanner.nextInt();
        orderScanner.nextLine();

        System.out.println("Enter customer name: "); 
        String customerName = orderScanner.nextLine();

        System.out.println("Enter customer email: ");
        String customerEmail = orderScanner.nextLine();

        this.customer = new Customer(customerName, customerEmail);

        System.out.println("Enter product name: "); 
        String productName = orderScanner.nextLine();

        System.out.println("Enter product cost: ");
        double productPrice = orderScanner.nextDouble();

        System.out.println("Enter product quantity: ");
        int productStock = orderScanner.nextInt();

        this.product = new Product(productName, productPrice, productStock);

        System.out.println("Enter total price: ");
        this.totalPrice = orderScanner.nextDouble();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void generateInvoice() {
        System.out.println(" ");
        System.out.println("Invoice for Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Product: " + product.getName());
        System.out.println("Total Price: $" + totalPrice);
    }

    public void generateInvoice(String additionalInfo) {
        System.out.println(" ");
        System.out.println("Invoice for Order ID: " + orderID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Product: " + product.getName());
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Additional Info: " + additionalInfo);
    }
}