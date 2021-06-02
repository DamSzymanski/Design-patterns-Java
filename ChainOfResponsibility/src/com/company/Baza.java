package com.company;

public class Baza extends Posterunek{
    public Baza(int poziomZagrozenia){
        this.poziomZagrozenia = poziomZagrozenia;
    }

    @Override
    protected void melduj(String wiadomosc) {
        System.out.println("Obecny poziom zagrożenia bazy" + wiadomosc);
    }
}
