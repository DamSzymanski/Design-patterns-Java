package com.company;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        BeginState beginState = new BeginState();
        beginState.doState(context);

        System.out.println(context.getState().toString());

        EndState endState = new EndState();
        endState.doState(context);

        System.out.println(context.getState().toString());


    }
}
