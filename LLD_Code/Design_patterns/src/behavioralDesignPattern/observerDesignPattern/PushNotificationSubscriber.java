package behavioralDesignPattern.observerDesignPattern;

public class PushNotificationSubscriber implements Subscriber{
    private String name;
    public PushNotificationSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println("push notification sent to "+this.name);
    }
}
