package com.company;

public class BigProcessImplementation implements BigProcess {
    public BigProcessImplementation() {
        BigInitConfig();
    }

    @Override
    public void process() {
        System.out.println("processing done");
    }

    private void BigInitConfig() {
        System.out.println("Loading initial configuration...");
    }
}
