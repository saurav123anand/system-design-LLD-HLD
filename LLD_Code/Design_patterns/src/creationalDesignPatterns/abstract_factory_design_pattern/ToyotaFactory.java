
package creationalDesignPatterns.abstract_factory_design_pattern;

public class ToyotaFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new Toyota();
  }
}