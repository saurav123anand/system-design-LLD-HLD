package creationalDesignPatterns.factory_design_pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle car= VehicleFactory.getVehicle(VehicleType.CAR);
        car.start();
    }

}
