package com.company;

public class TankElementDisplayVisitor implements TankVisitor{
    @Override
    public void visit(Tank tank) {
        System.out.println("Oto czołg");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Oto silnik");
    }

    @Override
    public void visit(Gun gun) {
        System.out.println("Oto działo");
    }

    @Override
    public void visit(Turret turret) {
        System.out.println("Oto wieżyczka");
    }
}
