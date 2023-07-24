package org.example.Homework.HW12;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Logger logger = new ConsoleLogger();


        Calculator calculator = new Calculator(logger);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действительную часть первого числа: ");
        double real1 = scanner.nextDouble();
        System.out.print("Введите мнимую часть первого числа: ");
        double imaginary1 = scanner.nextDouble();
        System.out.print("Введите действительную часть второго числа: ");
        double real2 = scanner.nextDouble();
        System.out.print("Введите мнимую часть второго числа: ");
        double imaginary2 = scanner.nextDouble();

        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);


        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);


        scanner.close();
    }
}







