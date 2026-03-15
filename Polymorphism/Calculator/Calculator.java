package Polymorphism.Calculator;

public class Calculator {
    // ADD METHODS 

    void add(int a, int b) {
        System.out.println("Addition of two numbers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Addition of three numbers: " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Addition of two decimal numbers: " + (a + b));
    }

    // SUBTRACT METHODS

    void subtract(int a, int b) {
        System.out.println("Subtraction of two numbers: " + (a - b));
    }

    void subtract(double a, double b) {
        System.out.println("Subtraction of two decimal numbers: " + (a - b));
    }

    //MULTIPLICATION METHODS

    void multiply(int a, int b) {
        System.out.println("Multiplication of two numbers: " + (a * b));
    }

    void multiply(int a, int b, int c) {
        System.out.println("Multiplication of three numbers: " + (a * b * c));
    }
}


