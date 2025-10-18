package behavioralDesignPattern.strategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("credit card payment");
    }
}
