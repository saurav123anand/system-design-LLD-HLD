package abstract_factory_design_pattern;

public class EuropeTruck implements Truck {
    @Override
    public void transport() {
        System.out.println("Transporting goods with a truck from Europe.");
    }
}