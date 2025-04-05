package abstract_factory_design_pattern;

// Client Class
public class Client {
    private Car car;
    private Truck truck;

    public Client(VehicleFactory factory) {
        this.car = factory.createCar();
        this.truck = factory.createTruck();
    }

    public void getVehicleInfo() {
        car.drive();
        truck.transport();
    }
}
