package Products;

import java.util.Scanner;

public class FoodItems extends Product {
    private String expirationDate;

    public static void main(String[] args) {
        FoodItems newFood = new FoodItems();
        newFood.inputDetails();
        newFood.displayDetails();
    }

    public FoodItems(String name, double price, int stockQuantity, String expirationDate) {
        super(name, price, stockQuantity);
        this.expirationDate = expirationDate;
    }

    public FoodItems() {
        super("", 0.0, 0);
        this.expirationDate = "";
    }

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner foodScanner = new Scanner(System.in);
        System.out.println("Enter Expiration Date: "); 
        this.expirationDate = foodScanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiration Date is: " + expirationDate);
    }
}
