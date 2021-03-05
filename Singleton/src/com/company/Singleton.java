package com.company;

public class Singleton {
    private static volatile  Singleton _instancja;
    protected Singleton(){ }

    public static Singleton zwrocInstancje(){
        Singleton res = _instancja;
        if (res != null) {
            return res;
        }
        synchronized(Singleton.class){
        if(_instancja==null){
        _instancja=new Singleton();
        }
        return _instancja;

    }

    }
}
