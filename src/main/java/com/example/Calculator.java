package com.example;

public class Calculator {

    public int calculate(int a, int b, String op) {

        if (op == null) {
            throw new IllegalArgumentException("Operation must not be null");
        }

        switch (op) {
            case "add":
                return add(a, b);

            case "sub":
                return subtract(a, b);

            case "mul":
                return multiply(a, b);

            case "div":
                return divide(a, b);

            case "mod":
                return modulo(a, b);

            case "pow":
                return power(a, b);

            default:
                throw new IllegalArgumentException("Unsupported operation: " + op);
        }
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    private int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed");
        }
        return a % b;
    }

    private int power(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("Negative exponent not supported");
        }
        return (int) Math.pow(a, b);
    }
}
