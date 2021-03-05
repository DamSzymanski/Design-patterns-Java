package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton s1=Singleton.zwrocInstancje();
        Singleton s2=Singleton.zwrocInstancje();

        if(s1==s2)
            System.out.println("s1 i s2 to ta sama instancja");
        else
            System.out.println("s1 i s2 to różne instancje");
    }
}
