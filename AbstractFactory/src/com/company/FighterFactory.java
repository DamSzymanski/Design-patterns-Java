package com.company;

public class FighterFactory implements SamolotAbstractFactory {
    private String name;
    private String speed;

    public FighterFactory(String name, String speed){
        this.name=name;
        this.speed=speed;
    }
    @Override
    public Samolot createPlane() {
        return new Fighter(name,speed);
    }
}
