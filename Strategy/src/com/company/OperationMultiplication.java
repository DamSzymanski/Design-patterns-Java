package com.company;

public class OperationMultiplication implements Strategy {
    @Override
    public int makeOperation(int num1, int num2) {
        return num1 * num2;
    }
}
