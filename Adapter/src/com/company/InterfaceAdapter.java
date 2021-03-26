package com.company;

public class InterfaceAdapter implements ArchaicznyInterfejs {
    NowoczesnyInterfejs nowoczesnyInterfejs;

    public InterfaceAdapter(String val1){

        if(val1.equalsIgnoreCase("rodz1") ){
            nowoczesnyInterfejs = new Wykonujaca();

        }else if (val1.equalsIgnoreCase("rodz2")){
            nowoczesnyInterfejs = new Wykonujaca();
        }
    }

    @Override
    public void metoda(String rodzaj) {

        if(rodzaj.equalsIgnoreCase("rodz1")){
            nowoczesnyInterfejs.metodaRodzaj1(rodzaj);
        }
        else if(rodzaj.equalsIgnoreCase("rodz2")){
            nowoczesnyInterfejs.metodaRodzaj2(rodzaj);
        }
    }
}
