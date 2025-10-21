package behavioralDesignPattern.stateDesignPattern;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
