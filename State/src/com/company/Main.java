package com.company;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doState(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doState(context);

        System.out.println(context.getState().toString());


    }
}
