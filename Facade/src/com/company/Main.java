package com.company;

public class Main {

    public static void main(String[] args){
        Fasada fasada = new Fasada();

        fasada.MetodaA();
        fasada.MetodaB();


        //ZADANIE 2
        Hipoteka hipoteka = new Hipoteka();

        // Sprawdzanie czy klient kwalifikuje się
        Klient klient = new Klient("Jan Drążkowski");
        boolean kwalifikujeSie = hipoteka.CzyKwalifikujeSie(klient, 125000);

        System.out.println("\n" + klient.Imie + " zakwalifikował się w systemie jako " + (kwalifikujeSie ? "Zakceptowany" : "Odrzucony"));
    }
}

class PodSystemPierwszy {
    public void MetodaPierwsza() {
        System.out.println(" PodSystemPierwszy Metoda");
    }
}

class PodSystemDrugi {
    public void MetodaDruga() {
        System.out.println(" PodSystemDrugi Metoda");
    }
}

class PodSystemTrzeci {
    public void MetodaTrzecia() {
        System.out.println(" PodSystemTrzeci Metoda");
    }
}

class PodSystemCzwarty {
    public void MetodaCzwarta() {
        System.out.println(" PodSystemCzwarty Metoda");
    }
}

class Fasada
{
    private PodSystemPierwszy _pierwszy ;
    private PodSystemDrugi _dwa;
    private PodSystemTrzeci _trzy;
    private PodSystemCzwarty _cztery;

    public Fasada()
    {
        _pierwszy = new PodSystemPierwszy();
        _dwa = new PodSystemDrugi();
        _trzy = new PodSystemTrzeci();
        _cztery = new PodSystemCzwarty();
    }

    public void MetodaA()
    {
        System.out.println("\nMetodaA() ---- ");
        _pierwszy.MetodaPierwsza();
        _dwa.MetodaDruga();
        _cztery.MetodaCzwarta();
    }

    public void MetodaB()
    {
        System.out.println("\nMetodaB() ---- ");
        _dwa.MetodaDruga();
        _trzy.MetodaTrzecia();
    }
}


//ZADANIE 2
class Bank
{
    public boolean PosiadaWystarczajaceOszczednosci(Klient klient, int wartoscZayptaniaKredytowego)
    {
        System.out.println("Sprawdzanie banku dla " + klient);
        return true;
    }
}

class Kredyt
{
    public boolean PosiadaDobraHistorieKredytowa(Klient klient)
    {
        System.out.println("Sprawdzanie historii kredytowej dla " + klient);
        return true;
    }
}

class Pozyczka
{
    public boolean NiePosiadaNieOplaconychPozyczek(Klient klient)
    {
        System.out.println("Sprawdzanie historii pożyczek dla " + klient);
        return true;
    }
}

class Klient
{
    private String _imie;

    public Klient(String imie)
    {
        this._imie = imie;
    }

    public String Imie() {
        return _imie;
    }
}

class Hipoteka
{
    private Bank _bank = new Bank();
    private Pozyczka _pozyczka = new Pozyczka();
    private Kredyt _kredyt = new Kredyt();

    public boolean CzyKwalifikujeSie(Klient klient, int wartoscZayptaniaKredytowego)
    {
        System.out.println("{0} wysłał zapytanie o kredyt hipoteczny o wartosci {1:C}\n",
                klient.Imie, wartoscZayptaniaKredytowego);

        boolean kwalifikujeSie = true;

        if (!_bank.PosiadaWystarczajaceOszczednosci(klient, wartoscZayptaniaKredytowego))
        {
            kwalifikujeSie = false;
        }
        else if (!_pozyczka.NiePosiadaNieOplaconychPozyczek(klient))
        {
            kwalifikujeSie = false;
        }
        else if (!_kredyt.PosiadaDobraHistorieKredytowa(klient))
        {
            kwalifikujeSie = false;
        }

        return kwalifikujeSie;
    }
}

