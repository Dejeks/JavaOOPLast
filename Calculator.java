package org.example.Homework.HW12;

public class Calculator {
    private Logger logger;

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.add(num2);
        logger.log("Сумма: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.multiply(num2);
        logger.log("Умножение: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.divide(num2);
        logger.log("Деление: " + num1 + " / " + num2 + " = " + result);
        return result;
    }
}
