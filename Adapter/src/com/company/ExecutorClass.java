package com.company;

public class ExecutorClass implements ArchaicznyInterfejs{
    InterfaceAdapter adapter;

    @Override
    public void metoda(String rodzaj) {

        if(rodzaj.equalsIgnoreCase("rodz1")){
            System.out.println("Wykonano metodę rodzaju: " + rodzaj);
        }

        else if(rodzaj.equalsIgnoreCase("rodz2") ){
            adapter = new InterfaceAdapter(rodzaj);
            adapter.metoda(rodzaj);
        }

        else{
            System.out.println("Błędne dane wejściowe: " + rodzaj );
        }
    }
}
