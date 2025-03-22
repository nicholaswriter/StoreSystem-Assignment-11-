package Orders;

public class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount, "Cash");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Cash Payment: $" + amount);
    }
}
