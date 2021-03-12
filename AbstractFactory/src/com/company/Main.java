package com.company;

public class Main {

    public static void main(String[] args) {
        Samolot fighter = SamolotFactory.getSamolot(new FighterFactory("Supermarine Spitfire","338km/h"));
        Samolot civilian = SamolotFactory.getSamolot(new CivilianFactory("Boeing 767","913km/h"));
        System.out.println("AbstractFactory Fighter Config::"+fighter);
        System.out.println("AbstractFactory Civilian Config::"+civilian);
    }
}
