package com.company;

public class BigProcessProxy implements  BigProcess{
    private static BigProcess object;

    @Override
    public void process() {
        if (object == null) {
            object = new BigProcessImplementation();
        }
        object.process();
    }
}
