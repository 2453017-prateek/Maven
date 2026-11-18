package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(30.0, calculator.add(10, 20), 0.001);
    }

    @Test
    void testSubtraction() {
        assertEquals(10.0, calculator.subtract(20, 10), 0.001);
    }

    @Test
    void testMultiplication() {
        assertEquals(200.0, calculator.multiply(10, 20), 0.001);
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.divide(20, 10), 0.001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10, 0)
        );
    }
}
