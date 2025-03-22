package Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Products.Product;

public class Seller extends User implements Sellable {
    private List<Product> productsForSale;

    public Seller(String name, String email) {
        super(name, email);
        this.productsForSale = new ArrayList<>();
    }

    @Override
    public void inputDetails () {
        Scanner userScanner = new Scanner(System.in);
        super.inputDetails();
    }

    @Override
    public void displayDetails() {
    super.displayDetails();
    System.out.println("Products for Sale: ");
    for (Product product : productsForSale) {
        System.out.println(product.getName());
    }
    }

    @Override
    public void addProduct(Product product) {
        productsForSale.add(product);
        System.out.println(product.getName() + " added to seller inventory.");
    }

    @Override
    public void removeProduct(Product product) {
        if (productsForSale.contains(product)) {
            productsForSale.remove(product);
            System.out.println(product.getName() + " was removed from seller inventory.");
        } else {
            System.out.println("Product not found in existing inventory.");
        }
    }
}
