package Products;

import java.util.Scanner;

public class Clothing extends Product {
    private String size;

    public static void main(String[] args) {
        Clothing newClothing = new Clothing();
        newClothing.inputDetails();
        newClothing.displayDetails();
    }

    public Clothing(String name, double price, int stockQuantity, String size) {
        super(name, price, stockQuantity);
        this.size = size;
    }

    public Clothing() {
        super("", 0.0, 0);
        this.size = "";
    }

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner clothingScanner = new Scanner(System.in);
        System.out.println("Enter Clothing Size: "); 
        this.size = clothingScanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Clothing Size: " + size);
    }
}
