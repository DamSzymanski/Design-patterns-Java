package com.company;

public class Main {

    public static void main(String[] args) {
        CarBody audi=new Sedan(new Audi());
        CarBody mercedes=new Sedan(new Mercedes());
       System.out.println( audi.buildCarBody());
       System.out.println( mercedes.buildCarBody());
    }
}
