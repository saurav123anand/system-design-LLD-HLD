package abstract_factory_design_pattern;

public class USAVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new USACar();
    }

    @Override
    public Truck createTruck() {
        return new USATruck();
    }
}