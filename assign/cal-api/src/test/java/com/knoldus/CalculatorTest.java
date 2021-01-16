package com.knoldus;
import junit.framework.TestCase;


// Unit test for Calculator App
public class CalculatorTest extends TestCase
{
    Calculator calculator = new Calculator();

    public void testAddition() {
        int result= calculator.addition(2, 3);
        assertTrue(result == 5);
    }

    public void testSubtraction() {
        int result= calculator.subtraction(3,2);
        assertTrue(result == 1);
    }

    public void testMultiplication() {
        int result= calculator.multiplication(3,2);
        assertTrue(result == 6);
    }

    public void testDivision() {
        double result= calculator.division(6,2);
        assertTrue(result == 3);
    }
    public void testDivisionOnZero() {
        double result= calculator.division(6,0);
        assertTrue(result == 0);
    }
}