package com.csc205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // SEAT

        // Setup
        int expect = 4;

        //Exercise
        int actual = new Calculator().add(2, 2);

        //assert
        assertEquals(expect, actual);
    }

    @Test
    void testAdd() {

        int expect = 4;
        int actual = new Calculator().add(2,2);

        assertEquals(expect, actual);
    }

    @Test
    void subtract() {

        int expect = 4;
        int actual = new Calculator().subtract(6,2);

        assertEquals(expect, actual);
    }

    @Test
    void multiple() {

        int expect = 4;
        int actual = new Calculator().multiple(2,2);

        assertEquals(expect, actual);
    }

    @Test
    void divide() {

        int expect = 4;
        int actual = new Calculator().divide(8,2);

        assertEquals(expect, actual);
    }

    @Test
    void divideByZero(){
        assertThrows(ArithmeticException.class, () ->{
            new Calculator().divide(0, 0);
        });
    }
}