package behavioral.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(100);

        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(200);
    }
}
