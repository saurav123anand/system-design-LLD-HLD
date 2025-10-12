
package creationalDesignPatterns.abstract_factory_design_pattern;

public class Main {
  public static void main(String[] args) {
    VehicleFactory hondaFactory = new HondaFactory();
    Vehicle honda = hondaFactory.createVehicle();
    honda.start();
    honda.stop();
    VehicleFactory toyotaFactory = new ToyotaFactory();
    Vehicle toyota = toyotaFactory.createVehicle();
    toyota.start();
    toyota.stop();
  }
}