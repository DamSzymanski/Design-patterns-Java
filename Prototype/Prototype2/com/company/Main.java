package com.company;

import java.awt.event.KeyListener;

public class Main {

            public static void main(String[] args) throws Exception {
                Main obj = new Main ();
                obj.run();

            }

         public void run () throws Exception
            {
                Prototyp prototyp1 = new PrototypY("I");
                Prototyp klon1 = (PrototypY) prototyp1.Klonuj();
                System.out.println("Sklonowano: {0}, klon1.Id");

                Prototyp prototyp2 = new PrototypX("II");
                Prototyp klon2 = (PrototypX) prototyp2.Klonuj();
                System.out.println("Sklonowano: {0}, klon1.Id");

                System.in.wait(1222);
            }

            abstract class Prototyp
            {
                private String Id;

                public Prototyp(String id)
                {
                    Id = id;
                }

                public final String getId()
                {
                    return Id;
                }

                public abstract Prototyp Klonuj();
            }



            class PrototypX extends Prototyp
            {
                public PrototypX(String id)
                {
                    super(id);
                }

                @Override
                public Prototyp Klonuj()
                {
                    try {
                        return (Prototyp)clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            }



            class PrototypY extends Prototyp
            {
                public PrototypY(String id)
                {
                    super(id);
                }

                @Override
                public Prototyp Klonuj()
                {
                    try {
                        return (Prototyp)clone();
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                        return null;
                    }
                }

            }
        }
