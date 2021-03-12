package com.company;

public class TankFactory {
    public static Tank getTank(String type, String armor, String name, String speed){
        if("TankDetails".equalsIgnoreCase(type)) return new TankDetails(name, armor, speed);
        else if("ArmoredVehicleDetails".equalsIgnoreCase(type)) return new ArmoredVehicleDetails(name, armor, speed);

        return null;
    }
}
