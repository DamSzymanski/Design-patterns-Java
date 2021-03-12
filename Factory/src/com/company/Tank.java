package com.company;

public abstract class Tank {

    public abstract String getArmor();
    public abstract String getSpeed();
    public abstract String getName();

    @Override
    public String toString(){
        return "Name= "+this.getName()+", Armor="+this.getArmor()+", Speed="+this.getSpeed();
    }
}
