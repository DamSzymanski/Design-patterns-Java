package com.company;

public class Fighter extends Samolot {
    private String name;
    private String speed;

    public Fighter(String name, String speed){
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
