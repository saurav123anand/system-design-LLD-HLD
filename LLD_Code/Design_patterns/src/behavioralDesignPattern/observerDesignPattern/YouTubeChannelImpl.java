package behavioralDesignPattern.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannelImpl implements YouTubeChannel{
    List<Subscriber> subscribers=new ArrayList<>();
    private String video;
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
       subscribers.remove(subscriber);
    }

    public void uploadVideo(String video){
        this.video=video;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
         subscribers.stream().forEach(Subscriber::update);
    }
}
