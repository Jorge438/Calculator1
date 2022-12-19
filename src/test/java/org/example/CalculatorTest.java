package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    public CalculatorTest() {
        this.calculator = new Calculator();
    }

    @Test
    void testAdd() {
        Assertions.assertEquals(12,calculator.add(10,2));
    }

    @Test
    void testSub() {
        Assertions.assertEquals(8,calculator.sub(10,2));
    }

    @Test
    void testMult() {
        Assertions.assertEquals(20,calculator.mult(10,2));
    }

    @Test
    void testDiv() {
        Assertions.assertEquals(5,calculator.div(10,2));
    }
}