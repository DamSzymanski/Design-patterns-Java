package com.company;

public class Main {

    public static void main(String[] args) {
        Tank tank = new TankBuilder()
                .setSpeed(50)
                .setModel("T-34-85")
                .fromNation("ZSRR")
                .withArmor(40)
                .withGunPenetration(140)
                .build();
        System.out.println(tank.getModel());
    }
}
