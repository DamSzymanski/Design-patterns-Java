package com.company;

public abstract class CarBody {
    protected Car car;

    public CarBody(Car car) {
        this.car=car;
    }

    abstract public String buildCarBody();
}
