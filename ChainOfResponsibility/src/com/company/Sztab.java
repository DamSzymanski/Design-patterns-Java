package com.company;

public class Sztab extends Posterunek{
    public Sztab(int poziomZagrozenia){
        this.poziomZagrozenia = poziomZagrozenia;
    }

    @Override
    protected void melduj(String wiadomosc) {
        System.out.println("Obecny poziom zagrożenia sztabu" + wiadomosc);
    }

}
