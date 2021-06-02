package com.company;

import java.util.ArrayList;

class Kontekst{

}
abstract class WyrazenieAbstrakcyjne{
    public abstract void Interpretuj(Kontekst kontekst);
}

class WyrazenieTerminalne extends WyrazenieAbstrakcyjne{
    @Override
    public void Interpretuj(Kontekst kontekst) {
        System.out.println("Wywołano WyrazenieTerminalne.Interpretuj()");
    }
}

class WyrazenieNieterminalne extends WyrazenieAbstrakcyjne{
    @Override
    public void Interpretuj(Kontekst kontekst) {
        System.out.println("Wywołano WyrazenieNieterminalne.Interpretuj()");
    }
}

public class Main {

    public static void main(String[] args) {
	    Kontekst kontekst = new Kontekst();
        ArrayList<WyrazenieAbstrakcyjne> wyrazenia = new ArrayList<>();

        wyrazenia.add(new WyrazenieTerminalne());
        wyrazenia.add(new WyrazenieNieterminalne());
        wyrazenia.add(new WyrazenieTerminalne());
        wyrazenia.add(new WyrazenieTerminalne());

        for(WyrazenieAbstrakcyjne wyrazenie : wyrazenia){
            wyrazenie.Interpretuj(kontekst);
        }

    }
}
