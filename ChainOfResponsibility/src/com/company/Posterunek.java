package com.company;

public abstract class Posterunek {

    public static int BrakRyzyka = 1;
    public static int Zagrozenie = 2;
    public static int Atakowany = 3;

    protected int poziomZagrozenia;

    //next element in chain or responsibility
    protected Posterunek kolejnyPosterunek;

    public void setkolejnyPosterunek(Posterunek kolejnyPosterunek){
        this.kolejnyPosterunek = kolejnyPosterunek;
    }

    public void meldujZagrozenie(int poziomZagrozenia, String wiadomosc){
        if(this.poziomZagrozenia <= poziomZagrozenia){
            melduj(wiadomosc);
        }
        if(kolejnyPosterunek !=null){
            kolejnyPosterunek.meldujZagrozenie(poziomZagrozenia, wiadomosc);
        }
    }

    abstract protected void melduj(String wiadomosc);
}
