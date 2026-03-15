package Polymorphism.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
	    Calculator c = new Calculator();

        // Add methods
        c.add(10, 20);
        c.add(5, 10, 15);
        c.add(2.5, 3.5);

        System.out.println("----------------");

        // Subtract methods
        c.subtract(20, 5);
        c.subtract(10.5, 4.2);

        System.out.println("----------------");

        // Multiply methods
        c.multiply(4, 5);
        c.multiply(2, 3, 4);
    }
}
