package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calculator.calculate(10, 5, "add"));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.calculate(10, 5, "sub"));
    }

    @Test
    void testMultiply() {
        assertEquals(50, calculator.calculate(10, 5, "mul"));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.calculate(10, 5, "div"));
    }

    @Test
    void testModulo() {
        assertEquals(0, calculator.calculate(10, 5, "mod"));
    }

    @Test
    void testPower() {
        assertEquals(100, calculator.calculate(10, 2, "pow"));
    }

    @Test
    void testInvalidOperation() {
        // Expect IllegalArgumentException for unsupported operation
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculate(10, 5, "add-again"));
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculate(10, 5, "sub-again"));
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculate(10, 5, "invalid"));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.calculate(10, 0, "div"));
    }

    @Test
    void testModuloByZero() {
        assertThrows(ArithmeticException.class,
                () -> calculator.calculate(10, 0, "mod"));
    }
}
