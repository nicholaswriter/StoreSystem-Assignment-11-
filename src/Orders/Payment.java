package Orders;

public abstract class Payment {
    protected double amount;
    protected String Method;

    public Payment(double amount, String Method) {
        this.amount = amount;
        this.Method = Method;
    }

    public abstract void processPayment();
}
