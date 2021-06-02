package com.company;

public interface TankVisitor {
    public void visit(Tank tank);
    public void visit(Gun gun);
    public void visit(Engine engine);
    public void visit(Turret turret);
}
