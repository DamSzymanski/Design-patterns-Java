package com.company;

public class SamolotFactory {
    public static Samolot getSamolot(SamolotAbstractFactory factory){
        return factory.createPlane();
    }
}
