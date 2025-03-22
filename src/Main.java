import Orders.*;
import Products.*;
import Users.*;
import Reviews.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("What would you like to do? Please enter the number.");
        System.out.println("(1) Manage Products");
        System.out.println("(2) Manage Users");
        System.out.println("(3) Manage Reviews");
        System.out.println("(4) Manage Orders");
        int main_input = mainScanner.nextInt();

        if (main_input == 1) {
            System.out.println(" ");
            System.out.println("What type of product?");
            System.out.println("(1) Clothing Item");
            System.out.println("(2) Food Item");
            int productChoice = mainScanner.nextInt();
            if (productChoice == 1) {
                Clothing clothing = new Clothing();
                clothing.inputDetails();
                clothing.displayDetails();
            } else if (productChoice == 2) {
                FoodItems foodItem = new FoodItems();
                foodItem.inputDetails();
                foodItem.displayDetails();
            } else {
                System.out.println("Invalid input");
            }
        } else if (main_input == 2) {
            System.out.println(" ");
            System.out.println("What type of User?");
            System.out.println("(1) Customer");
            System.out.println("(2) Seller");
            int userChoice = mainScanner.nextInt();
            if (userChoice == 1) {
                Customer customer = new Customer("", "");
                customer.inputDetails();
                customer.displayDetails();
            } else if (userChoice == 2) {
                Seller seller = new Seller("", "");
                seller.inputDetails();
                seller.displayDetails();
            } else {
                System.out.println("Invalid input");
            }
        } else if (main_input == 3) {
            System.out.println(" ");
            System.out.println("What type of Reviews?");
            System.out.println("(1) Product Review");
            System.out.println("(2) Employee Reviews");
            int reviewChoice = mainScanner.nextInt();
            if (reviewChoice == 1) {
                ProductReview prod_rev = new ProductReview();
                prod_rev.inputDetails();
                prod_rev.displayDetails();
            } else if (reviewChoice == 2) {
                EmployeeReview emp_rev = new EmployeeReview();
                emp_rev.inputDetails();
                emp_rev.displayDetails();
            } else {
                System.out.println("Invalid input");
            }
        } else if (main_input == 4) {
            System.out.println(" ");
            Order order = new Order(0, null, null, 0.0);
            order.inputDetails();
            order.generateInvoice();
            System.out.println("Will you pay with (1) Cash, or (2) Card?");
            int orderChoice = mainScanner.nextInt();
            if (orderChoice == 1) {
                CashPayment cashp = new CashPayment(0.0);
                cashp.processPayment();
            }

            if (orderChoice == 2) {
                CardPayment cardp = new CardPayment(0.0);
                cardp.processPayment();
            }
        } else {
            System.out.println("Error. Invalid input.");
        }
        mainScanner.close();
    }
}