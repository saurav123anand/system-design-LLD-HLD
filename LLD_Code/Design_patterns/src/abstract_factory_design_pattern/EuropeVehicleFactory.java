package abstract_factory_design_pattern;

public class EuropeVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new EuropeCar();
    }

    @Override
    public Truck createTruck() {
        return new EuropeTruck();
    }
}
