package com.knoldus;

public class Calculator {

    public int addition(int firstNum, int SecondNum) {
        return firstNum + SecondNum;
    }

    public int multiplication(int firstNum, int SecondNum) {
        return firstNum * SecondNum;
    }

    public int subtraction(int firstNum, int SecondNum) {
        return firstNum - SecondNum;
    }

    public double division(double firstNum, double SecondNum) {
        if (SecondNum != 0) {
            return firstNum / SecondNum;
        } 
        else {
            return 0;
        }
    }
}