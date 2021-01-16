package com.knoldus;
import java.util.*;

// Main Class
public class Application {
    public static void main(String[] args) {
        System.out.println("-------------------- Calculator ----------------------");
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int firstNum, SecondNum;
        firstNum = sc.nextInt();
        SecondNum = sc.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Addition of two number is "+ calculator.addition(firstNum, SecondNum));
        System.out.println("Subtraction of two number is "+ calculator.subtraction(firstNum, SecondNum));
        System.out.println("Multiplication of two number is "+ calculator.multiplication(firstNum, SecondNum));
        System.out.println("Devision of two number is "+ calculator.division(firstNum, SecondNum));
        System.out.println();
        sc.close();
    }
}