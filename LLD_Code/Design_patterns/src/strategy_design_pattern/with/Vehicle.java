package strategy_design_pattern.with;

import strategy_design_pattern.with.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;
    public Vehicle(DriveStrategy driveObj){
       this.driveObj=driveObj;
    }
    public void drive(){
        driveObj.drive();
    }
}
