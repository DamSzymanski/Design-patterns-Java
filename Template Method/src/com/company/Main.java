package com.company;

public class Main {

    public static void main(String[] args) {
        KlasaAbstrakcyjna aA = new SpecyficznaKlasaA();
        aA.MetodaSzablonowa();

        KlasaAbstrakcyjna aB = new SpecyficznaKlasaB();
        aB.MetodaSzablonowa();
    }
}

abstract class KlasaAbstrakcyjna
{
    abstract void ZrobCos();
    abstract void JakasInnaMetoda();

    public void MetodaSzablonowa()
    {
        ZrobCos();
        JakasInnaMetoda();
        System.out.println("");
    }
}

class SpecyficznaKlasaA extends KlasaAbstrakcyjna
{
    @Override
    void ZrobCos()
    {
        System.out.println("SpecyficznaKlasaA.ZrobCos()");
    }

    @Override
    void JakasInnaMetoda()
    {
            System.out.println("SpecyficznaKlasaA.JakasInnaMetoda()");
    }
}

class SpecyficznaKlasaB extends KlasaAbstrakcyjna
{
    @Override
    void ZrobCos()
    {
        System.out.println("SpecyficznaKlasaB.ZrobCos()");
    }

    @Override
    void JakasInnaMetoda()
    {
        System.out.println("SpecyficznaKlasaB.JakasInnaMetoda()");
    }
}