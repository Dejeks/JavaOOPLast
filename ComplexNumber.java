package org.example.Homework.HW12;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Методы для сложения, умножения и деления комплексных чисел
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realResult = real * other.real - imaginary * other.imaginary;
        double imaginaryResult = real * other.imaginary + imaginary * other.real;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.real * other.real + other.imaginary * other.imaginary;
        double realResult = (real * other.real + imaginary * other.imaginary) / divisor;
        double imaginaryResult = (imaginary * other.real - real * other.imaginary) / divisor;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}
