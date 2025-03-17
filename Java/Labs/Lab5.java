// Demonstrating Nested Class in Java

class OuterClass {
    private String outerMessage = "Hello from Outer Class!";
    
    void showOuterMessage() {
        System.out.println(outerMessage);
    }
    
    // Nested Inner Class
    class InnerClass {
        void display() {
            System.out.println("Hello from Inner Class!");
        }
    }
}

// Main class to demonstrate nested class usage
public class Lab5 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.showOuterMessage(); // Printing outer class message
        
        OuterClass.InnerClass inner = outer.new InnerClass(); // Creating instance of inner class
        inner.display(); // Printing inner class message
    }
}