package com.company;

public class Wykonujaca implements NowoczesnyInterfejs {
    @Override
    public void metodaRodzaj1(String val1) {
        System.out.println("Wykonana metoda rodzaju 1 z przekazaną wartością:"+ val1);
    }

    @Override
    public void metodaRodzaj2(String val1) {
        System.out.println("Wykonana metoda rodzaju 2 z przekazaną wartością:"+ val1);
    }
}
