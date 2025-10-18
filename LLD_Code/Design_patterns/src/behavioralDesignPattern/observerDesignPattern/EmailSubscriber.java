package behavioralDesignPattern.observerDesignPattern;

public class EmailSubscriber implements Subscriber{
    private final String name;
    public EmailSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println("Email sent to "+this.name);
    }
}
