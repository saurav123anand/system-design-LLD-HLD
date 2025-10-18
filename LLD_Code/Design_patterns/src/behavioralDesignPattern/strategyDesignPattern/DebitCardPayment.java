package behavioralDesignPattern.strategyDesignPattern;

public class DebitCardPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Debit card payment");
    }
}
