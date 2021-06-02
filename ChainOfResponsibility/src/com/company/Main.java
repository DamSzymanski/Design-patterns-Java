package com.company;

public class Main {
    private static Posterunek pobierzLancuchBezpieczenstwa(){

        Posterunek sztab = new Sztab(Posterunek.Atakowany);
        Posterunek dowodztwo = new Dowodztwo(Posterunek.Zagrozenie);
        Posterunek baza = new Baza(Posterunek.BrakRyzyka);

        sztab.setkolejnyPosterunek(dowodztwo);
        dowodztwo.setkolejnyPosterunek(baza);

        return sztab;
    }
    public static void main(String[] args) {
    Posterunek posterunek=pobierzLancuchBezpieczenstwa();
    posterunek.meldujZagrozenie(Posterunek.BrakRyzyka,"nie ma ryzyka");
        posterunek.meldujZagrozenie(Posterunek.Zagrozenie,"jest zagrożenie");
        posterunek.meldujZagrozenie(Posterunek.Atakowany,"zaatakowane");
    }
}

