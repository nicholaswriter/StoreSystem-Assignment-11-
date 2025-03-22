package Reviews;

import java.util.Scanner;

public abstract class Review {
    protected int rating;
    protected String comment;
    protected String reviewer;

    public Review (int rating, String comment, String reviewer) {
        this.rating = rating;
        this.comment = comment;
        this.reviewer = reviewer;
    }

    public void inputDetails() {
        Scanner reviewScanner = new Scanner(System.in);
        System.out.println("Enter your rating: ");
        this.rating = reviewScanner.nextInt();

        reviewScanner.nextLine();

        System.out.println("Enter your comment: ");
        this.comment = reviewScanner.nextLine();

        System.out.println("Enter your (reviewer) name: ");
        this.reviewer = reviewScanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("Rating: " + rating);
        System.out.println("Comment: " + comment);
        System.out.println("Reviewer: " + reviewer);
    }
}
