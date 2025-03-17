// Parent class
class Calculator {
    // Method Overloading: Different parameter lists
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to be overridden
    void calculate() {
        System.out.println("Performing basic calculations.");
    }
}

// Child class
class AdvancedCalculator extends Calculator {
    // Overriding the calculate method for dynamic invocation
    @Override
    void calculate() {
        System.out.println("Performing advanced calculations.");
    }
}

public class Lab3 {
    public static void main(String[] args) {
        // Demonstrating method overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(5, 10));        // Calls add(int, int)
        System.out.println("Sum of three numbers: " + calc.add(5, 10, 15));  // Calls add(int, int, int)

        // Demonstrating dynamic method invocation
        Calculator advCalc = new AdvancedCalculator(); // Upcasting
        advCalc.calculate(); // Calls overridden method in AdvancedCalculator
    }
}
