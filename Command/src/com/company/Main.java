package com.company;

class Odbiorca
{
    public void Uruchom()
    {
        System.out.println("Wywołano Odbiorca.Uruchom()");
    }
}

abstract class Polecenie{
    protected Odbiorca odbiorca;

    public Polecenie(Odbiorca odbiorca)
    {
        this.odbiorca = odbiorca;
    }
    public abstract void Wykonaj();
}

class SpecyficznePolecenie extends Polecenie
{
    public SpecyficznePolecenie(Odbiorca odbiorca)
    {
        super(odbiorca);
    }

        @Override
        public void Wykonaj(){
        odbiorca.Uruchom();
    }
}

class ObiektWywolujacy
{
    private Polecenie _polecenie;

    public void UstawPolecenie(Polecenie polecenie)
    {
        this._polecenie = polecenie;
    }

    public void WykonajPolecenie()
    {
        _polecenie.Wykonaj();
    }
}
public class Main {

    public static void main(String[] args) {
        Odbiorca odbiorca = new Odbiorca();
        Polecenie polecenie = new SpecyficznePolecenie(odbiorca);
        ObiektWywolujacy wywolujacy = new ObiektWywolujacy();

        wywolujacy.UstawPolecenie(polecenie);
        wywolujacy.WykonajPolecenie();
;
    }
}
