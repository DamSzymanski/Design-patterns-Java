package com.company;

public class Turret implements TankElement{
    @Override
    public void bindToTank(TankVisitor tankVisitor) {
        tankVisitor.visit(this);
    }
}
