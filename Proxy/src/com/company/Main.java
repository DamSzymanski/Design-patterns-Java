package com.company;

public class Main {

    public static void main(String[] args) {
        BigProcess processImpl = new BigProcessProxy();
        processImpl.process();
        processImpl.process();


    }
}
