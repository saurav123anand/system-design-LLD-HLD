package behavioralDesignPattern.observerDesignPattern;

public class SmsSubscriber implements Subscriber{
    private final String name;
    public SmsSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println("sms sent to "+this.name);
    }
}
