package com.company;

public class Gun implements TankElement{
    @Override
    public void bindToTank(TankVisitor tankVisitor) {
        tankVisitor.visit(this);
    }
}
