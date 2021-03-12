package com.company;

public class CivilianFactory implements  SamolotAbstractFactory{
    private String name;
    private String speed;

    public CivilianFactory(String name, String speed){
        this.name=name;
        this.speed=speed;
    }
    @Override
    public Samolot createPlane() {
        return new Civilian(name,speed);
    }
}
