package com.company;

public class Tank {
    private double maxSpeed;
    private final String model;
    private String nation;
    private double armor;
    private double gunPenetration;

    public Tank(String model) {
        this.model = model;
    }

    public Tank(String model, String nation, double maxSpeed, double armor,
                double gunPenetration) {
        this.model = model;
        this.nation = nation;
        this.maxSpeed = maxSpeed;
        this.armor = armor;
        this.gunPenetration = gunPenetration;

    }

    public String getModel() {
        return model;
    }

    public String getNation() {
        return nation;
    }


}
