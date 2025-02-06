public class Lab1 { 

    // Default Constructor 
    public Lab1() {
        System.out.println("Class is activated !!");
    }

    // Overloaded Constructor with one parameter
    public Lab1(String message) {
        System.out.println(message);
    }

    // Overloaded Constructor with two parameters
    public Lab1(String message, int number) {
        System.out.println(message + " Number: " + number);
    }

    // Overloaded Constructor with three parameters
    public Lab1(String message, int number1, int number2) {
        System.out.println(message + " Numbers: " + number1 + ", " + number2);
    }

    public static void main(String[] args) {
        Lab1 var1 = new Lab1();
        Lab1 var2 = new Lab1("Hello");
        Lab1 var3 = new Lab1("Hello", 45);
        Lab1 var4 = new Lab1("Hello", 10, 20);
    }
}
