package behavioralDesignPattern.stateDesignPattern;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext context=new TrafficLightContext();
        context.next();
        context.next();
        context.next();
    }
}
