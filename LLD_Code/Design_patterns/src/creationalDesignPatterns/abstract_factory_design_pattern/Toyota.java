package creationalDesignPatterns.abstract_factory_design_pattern;

public class Toyota implements Vehicle {
    public void start() {
        System.out.println("Toyota Car is starting");
    }
    public void stop() {
        System.out.println("Toyota Car is stopping");
    }
}
