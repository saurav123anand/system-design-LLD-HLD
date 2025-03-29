package strategy_design_pattern.with;

import strategy_design_pattern.with.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
   public SportsVehicle(){
       super(new SportsDriveStrategy());
   }
}
