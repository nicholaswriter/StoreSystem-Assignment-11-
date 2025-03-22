package Users;

import java.util.Scanner;

public abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    
    public void inputDetails() {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = userScanner.nextLine();

        System.out.println("Enter email: ");
        this.email = userScanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
