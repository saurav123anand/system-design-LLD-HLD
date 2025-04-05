package abstract_factory_design_pattern;

// Main Class to demonstrate the Abstract Factory Pattern
public class Main {
    public static void main(String[] args) {
        // Creating a client with USA vehicle factory
        VehicleFactory usaFactory = new USAVehicleFactory();
        Client clientUSA = new Client(usaFactory);
        System.out.println("USA Vehicle Info:");
        clientUSA.getVehicleInfo();  // Output: Driving a car from the USA. Transporting goods with a truck from the USA.

        System.out.println();  // Empty line for separation

        // Creating a client with Europe vehicle factory
        VehicleFactory europeFactory = new EuropeVehicleFactory();
        Client clientEurope = new Client(europeFactory);
        System.out.println("Europe Vehicle Info:");
        clientEurope.getVehicleInfo();  // Output: Driving a car from Europe. Transporting goods with a truck from Europe.
    }
}
