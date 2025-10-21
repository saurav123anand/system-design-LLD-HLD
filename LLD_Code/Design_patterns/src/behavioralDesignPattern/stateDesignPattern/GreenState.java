package behavioralDesignPattern.stateDesignPattern;

class GreenState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from GREEN to YELLOW. Slow down!");
        context.setState(new YellowState());
    }
    @Override
    public String getColor() {
        return "GREEN";
    }
}