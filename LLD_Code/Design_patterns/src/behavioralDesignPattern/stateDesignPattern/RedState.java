package behavioralDesignPattern.stateDesignPattern;

public class RedState implements TrafficLightState{

    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from RED to Green...");
        context.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
