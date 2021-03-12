package com.company;

public abstract class Samolot {
    public abstract String getSpeed();
    public abstract String getName();

    @Override
    public String toString(){
        return "speed= "+this.getSpeed()+", name="+this.getName();
    }
}
