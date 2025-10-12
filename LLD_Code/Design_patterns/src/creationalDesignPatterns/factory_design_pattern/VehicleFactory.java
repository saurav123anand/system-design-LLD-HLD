package creationalDesignPatterns.factory_design_pattern;

public class VehicleFactory{
    public static Vehicle getVehicle(VehicleType vehicleType){
        if (vehicleType==null) throw new IllegalArgumentException("Vehicle type can't be null");
        return switch (vehicleType) {
            case CAR -> new Car();
            case BIKE -> new Bike();
            default -> throw new IllegalArgumentException("Unknown vehicle type");
        };
    }
}
