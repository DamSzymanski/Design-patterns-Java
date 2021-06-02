package com.company;

public class Engine implements TankElement{
    @Override
    public void bindToTank(TankVisitor tankVisitor) {
        tankVisitor.visit(this);
    }
}
