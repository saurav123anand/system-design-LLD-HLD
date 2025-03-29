package strategy_design_pattern.with;

import strategy_design_pattern.with.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
