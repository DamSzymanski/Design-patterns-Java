package com.company;

public class Tank implements TankElement{
    TankElement[] elements;

    public Tank(){
        elements = new TankElement[] {new Gun(), new Turret(), new Engine()};
    }


    @Override
    public void bindToTank(TankVisitor tankVisitor) {
        for (int i = 0; i < elements.length; i++) {
            elements[i].bindToTank(tankVisitor);
        }
        tankVisitor.visit(this);
    }
}
