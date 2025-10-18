package behavioralDesignPattern.observerDesignPattern;

public interface YouTubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();
    void uploadVideo(String video);
}
