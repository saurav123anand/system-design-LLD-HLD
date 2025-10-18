package behavioralDesignPattern.strategyDesignPattern;

public class PaymentProcessor {
    PaymentStrategy paymentStrategy;
    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void process(){
        paymentStrategy.processPayment();
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
}
