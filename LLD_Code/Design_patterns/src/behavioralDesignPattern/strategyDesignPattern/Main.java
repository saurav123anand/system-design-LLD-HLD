package behavioralDesignPattern.strategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment=new CreditCardPayment();
        PaymentStrategy debitCardPayment=new DebitCardPayment();
        PaymentProcessor paymentProcessor=new PaymentProcessor(creditCardPayment);
        paymentProcessor.process();
        paymentProcessor.setPaymentStrategy(debitCardPayment);
        paymentProcessor.process();

    }
}
