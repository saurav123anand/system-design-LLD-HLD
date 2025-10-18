package behavioralDesignPattern.strategyDesignPattern;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("paypal payment");
    }
}
