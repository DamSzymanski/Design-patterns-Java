package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Pamiatka pamiatka = new Pamiatka(1);
        pamiatka.setContent("Włącz");      //oryginalna wartość
        System.out.println(pamiatka);

        PamiatkaMemento memento = pamiatka.createMemento();   //Stworzenie niezmiennej pamiątki

        pamiatka.setContent("Wyłącz");      //zmieniona wartość
        System.out.println(pamiatka);

        pamiatka.restore(memento);       //UNDO zmian
        System.out.println(pamiatka);    //oryginalna wartość
    }
}

class Pamiatka
{
    private long id;
    private String content;

    public Pamiatka(long id) {
        super();
        this.id = id;
    }

    //Setters and getters

    public PamiatkaMemento createMemento()
    {
        PamiatkaMemento m = new PamiatkaMemento(id, content);
        return m;
    }

    public void restore(PamiatkaMemento m) {
        this.id = m.getId();
        this.content = m.getContent();
    }

    @Override
    public String toString() {
        return "Pamiątka [ID=" + id + ", Zawartość=" + content + "]";
    }

    public void setContent(String content) {
        this.content = content;
    }
}

final class PamiatkaMemento
{
    private final long id;
    private final String content;

    public PamiatkaMemento(long id, String content) {
        super();
        this.id = id;
        this.content = content;
    }


    public long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }
}

