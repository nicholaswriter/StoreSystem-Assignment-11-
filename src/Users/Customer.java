package Users;

import Products.Product;
import java.util.Scanner;

public class Customer extends User implements Payable {
    public Customer (String name, String email) {
        super(name, email);
    }

    @Override
    public void inputDetails() {
        Scanner userScanner = new Scanner(System.in);
        super.inputDetails();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
    }

    public void purchaseProduct(Product product) {
        System.out.println(name + " purchased " + product.getName());
    }

    @Override
    public void makePayment (double amount) {
        System.out.println(name + " paid " + amount);
    }
}
