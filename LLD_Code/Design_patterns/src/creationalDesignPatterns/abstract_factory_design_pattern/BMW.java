package creationalDesignPatterns.abstract_factory_design_pattern;

public class BMW implements Vehicle {
    public void start() {
        System.out.println("BMW Car is starting");
    }
    public void stop() {
        System.out.println("BMW Car is stopping");
    }
}
