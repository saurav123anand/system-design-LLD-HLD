package behavioralDesignPattern.observerDesignPattern;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel=new YouTubeChannelImpl();
        Subscriber subscriber1=new EmailSubscriber("email subscriber 1");
        Subscriber subscriber2=new EmailSubscriber("email subscriber 2");
        Subscriber subscriber3=new SmsSubscriber("sms subscriber 1");
        Subscriber subscriber4=new PushNotificationSubscriber("push notification subscriber 1");
        Subscriber subscriber5=new PushNotificationSubscriber("push notification subscriber 2");

        youTubeChannel.addSubscriber(subscriber1);
        youTubeChannel.addSubscriber(subscriber2);
        youTubeChannel.addSubscriber(subscriber3);
        youTubeChannel.addSubscriber(subscriber4);
        youTubeChannel.addSubscriber(subscriber5);

        youTubeChannel.uploadVideo("video1");

    }
}
