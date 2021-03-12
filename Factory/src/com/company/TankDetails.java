package com.company;

public class TankDetails extends Tank {
    private String name;
    private String armor;
    private String speed;

    public TankDetails(String name, String armor, String speed){
        this.speed=speed;
        this.armor=armor;
        this.name=name;
    }
    @Override
    public String getSpeed() {
        return this.speed;
    }

    @Override
    public String getArmor() {
        return this.armor;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
