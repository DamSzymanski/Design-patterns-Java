package com.company;

public class Main {

    public static void main(String[] args) {
	Tank tank=new Tank();
	tank.bindToTank(new TankElementDisplayVisitor());
    }
}
