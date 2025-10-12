package creationalDesignPatterns.abstract_factory_design_pattern;

public class HondaFactory implements VehicleFactory {
  public Vehicle createVehicle() {
    return new Honda();
  }
}

