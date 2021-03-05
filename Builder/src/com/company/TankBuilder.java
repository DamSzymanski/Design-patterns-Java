package com.company;

public class TankBuilder {

    private double maxSpeed;
    private String model;
    private String nation;
    private double armor;
    private double gunPenetration;

    public TankBuilder(String model, String nation, double maxSpeed, double armor,
                       double gunPenetration) {
        this.model = model;
        this.nation = nation;
        this.maxSpeed = maxSpeed;
        this.armor = armor;
        this.gunPenetration = gunPenetration;
    }

public TankBuilder(){}
    public TankBuilder setSpeed(double speed) {
        this.maxSpeed = speed;
        return this;
    }

    public TankBuilder fromNation(String nation) {
        this.nation = nation;
        return this;
    }

    public TankBuilder withArmor(double armor) {
        this.armor = armor;
        return this;
    }

    public TankBuilder withGunPenetration(double gunPen) {
        this.gunPenetration = gunPen;
        return this;
    }
public TankBuilder setModel(String name){
        this.model=name;
        return this;
}

    public Tank build() {
        return new Tank(model, nation, maxSpeed, armor, gunPenetration);
    }
}
