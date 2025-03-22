package Orders;

public class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount, "Card");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Card Payment: $" + amount);
    }
}