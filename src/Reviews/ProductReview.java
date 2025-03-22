package Reviews;

import java.util.Scanner;

public class ProductReview extends Review {
    private String product;
    public static void main(String[] args) {
        ProductReview newReview = new ProductReview();
        newReview.inputDetails();
        newReview.displayDetails();
    }

    public ProductReview(int rating, String comment, String reviewer, String product) {
        super(rating, comment, reviewer);
        this.product = product;
    }

    public ProductReview() {
        super(0, "", "");
        this.product = "";
    }

    @Override
    public void inputDetails() {
        Scanner productScanner = new Scanner(System.in);
        System.out.println("Enter product name: "); 
        this.product = productScanner.nextLine();
        super.inputDetails();
    }

    @Override
    public void displayDetails() {
        System.out.println(" ");
        System.out.println("Product: " + product);
        super.displayDetails();
    }
}
