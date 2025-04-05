package abstract_factory_design_pattern;

public class USACar implements Car{
    @Override
    public void drive() {
        System.out.println("Driving a car from the USA.");
    }
}
