package com.projects.backend.testdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    /***
     * test name should be when ...then
     * Readable
     */
    @Test
    void whenAddTwoIntegersThenRightResultExpected() {
        //Arrange
        int a = 10;
        int b = 20;
        Calculator c = new Calculator();
        //Act

        int result = c.add(a, b);

        //Assert
//        if(result == 40)
//            System.out.println("Success");
//        else
//            throw new RuntimeException("Failed");
        Assertions.assertEquals(30, result);
    }

    @Test
    void whenDivideTwoIntegersThenRightResultExpected() {
        //Arrange
        int a = 10;
        int b = 0;
        Calculator c = new Calculator();
        //Act
        // int result =  c.divide(a,b);
        //Assert
        Assertions.assertThrows(ArithmeticException.class, () -> c.divide(a, b));
    }
}