package behavioralDesignPattern.stateDesignPattern;

public class TrafficLightContext {
    private TrafficLightState currentState;
    public TrafficLightContext(){
        this.currentState=new RedState();
    }
    public void setState(TrafficLightState trafficLightState){
        this.currentState=trafficLightState;
    }
    public void next(){
        currentState.next(this);
    }
    public String getColor(){
        return currentState.getColor();
    }
}
