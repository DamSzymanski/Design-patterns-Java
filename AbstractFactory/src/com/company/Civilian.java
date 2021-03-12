package com.company;

public class Civilian extends Samolot {
    private String name;
    private String speed;

    public Civilian(String name, String speed){
        this.name=name;
        this.speed=speed;
    }
    @Override
    public String getSpeed() {
        return this.speed;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
