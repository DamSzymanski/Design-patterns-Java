package com.company;

public class Dowodztwo extends Posterunek{
    public Dowodztwo(int poziomZagrozenia){
        this.poziomZagrozenia = poziomZagrozenia;
    }

    @Override
    protected void melduj(String wiadomosc) {
        System.out.println("Obecny poziom zagrożenia dowodztwa" + wiadomosc);
    }
}
