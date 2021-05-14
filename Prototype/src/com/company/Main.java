package com.company;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    KolorSerwis kolorSerwis = new KolorSerwis();

	    //standardowe kolory
        kolorSerwis["czerwony"] = new Kolor(255,0,0);
        kolorSerwis["zielony"] = new Kolor(0,255,0);
        kolorSerwis["niebieski"] = new Kolor(0,0,255);

	    //kolory użytkownika
        kolorSerwis["jeden"] = new Kolor(255,45,0);
        kolorSerwis["dwa"] = new Kolor(0,255,232);
        kolorSerwis["trzy"] = new Kolor(99,44,255)

        //klonowanie kolory użytkownika
        Kolor color1 = kolorSerwis["czerwony"] = new Kolor(255,45,0);
        Object tempVar = kolorSerwis["dwa"].Klonuj();
        Kolor color2 = tempVar instanceof Kolor ? (Kolor)tempVar : null;
        Object tempVar2 = kolorSerwis["trzy"].Klonuj();
        Kolor color3 = tempVar2 instanceof Kolor ? (Kolor)tempVar2 : null;


        System.in.notify();
    }
}

abstract class KolorPrototyp{
    public abstract KolorPrototyp Klonuj() throws CloneNotSupportedException;
}

class Kolor extends KolorPrototyp{
    private int _red;
    private int _green;
    private int _blue;

    public Kolor(int red, int green, int blue)
    {
        _red = red;
        _green = green;
        _blue = blue;
    }

    @Override
    public KolorPrototyp Klonuj() throws CloneNotSupportedException {

        System.out.printf("Klonowanie koloru RGB: %1$3s, %2$3s, %3$3s" + "\r\n", _red, _green, _blue);
        Object tempVar = clone();
        return tempVar instanceof KolorPrototyp ? (KolorPrototyp)tempVar : null;
    }
}

class KolorSerwis {
    private HashMap<String, KolorPrototyp> _kolory = new HashMap<String, KolorPrototyp>();


    public String getValue(int key) {
        return _kolory[key];
    }

    public void setValue(int key, String value) {
        _kolory.put(key, value);
    }

}

