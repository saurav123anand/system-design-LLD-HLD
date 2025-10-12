package creationalDesignPatterns.abstract_factory_design_pattern;

public class BMWFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new BMW();
  }
}