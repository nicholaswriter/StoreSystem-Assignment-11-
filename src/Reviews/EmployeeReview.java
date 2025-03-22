package Reviews;

import java.util.Scanner;

public class EmployeeReview extends Review {
    private String employee;
    private String employee_level;
    public static void main(String[] args) {
        EmployeeReview newReview = new EmployeeReview();
        newReview.inputDetails();
        newReview.displayDetails();
    }

    public EmployeeReview(int rating, String comment, String reviewer, String employee, String employee_level) {
        super(rating, comment, reviewer);
        this.employee = employee;
        this.employee_level = employee_level;
    }

    public EmployeeReview() {
        super(0, "", "");
        this.employee = "";
        this.employee_level = "";
    }

    @Override
    public void inputDetails() {
        Scanner productScanner = new Scanner(System.in);

        System.out.println("Enter Employee Name: "); 
        this.employee = productScanner.nextLine();

        System.out.println("Enter Employee Title (cashier, manager, etc.): "); 
        this.employee_level = productScanner.nextLine();
        
        super.inputDetails();
    }

    @Override
    public void displayDetails() {
        System.out.println(" ");
        System.out.println("Employee / Level: " + employee + ": " + employee_level);
        super.displayDetails();
    }
}