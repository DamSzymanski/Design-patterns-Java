package com.company;

public class Sedan extends CarBody{
    public Sedan(Car car){
        super(car);
    }
    @Override
    public String buildCarBody(){

        return "Car model builded "+car.model();
    }

}
