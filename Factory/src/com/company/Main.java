package com.company;

public class Main {

    public static void main(String[] args) {
        Tank tankdetails = TankFactory.getTank("TankDetails","150mm","E75","15mph");
        Tank armoredvehicle = TankFactory.getTank("ArmoredVehicleDetails","10mm","EBR 105","80mph");
        System.out.println("Factory Tank Config::"+tankdetails);
        System.out.println("Factory Vehicle Config::"+armoredvehicle);
    }
}
