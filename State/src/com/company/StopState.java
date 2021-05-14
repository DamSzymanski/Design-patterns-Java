package com.company;

public class StopState implements State{
    public void doState(Context context) {
        System.out.println("Stan jest zatrzymywany");
        context.setState(this);
    }

    public String toString(){
        return "Stan zatrzymany";
    }
}
