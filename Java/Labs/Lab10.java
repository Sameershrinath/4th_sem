//10. Write a Java Program to implement Wrapper classes and their methods. import java.io.*



import java.io.*;


public class Lab10 {
    

        public static void main(String[] args) {
            // Primitive data types
            int num = 10;
            double d = 25.5;
            char c = 'A';
    
            // Converting primitive types into Wrapper objects (Autoboxing)
            Integer intObj = num;
            Double doubleObj = d;
            Character charObj = c;
    
            System.out.println("Integer Object: " + intObj);
            System.out.println("Double Object: " + doubleObj);
            System.out.println("Character Object: " + charObj);
    
            // Converting Wrapper objects to primitives (Unboxing)
            int intVal = intObj;
            double doubleVal = doubleObj;
            char charVal = charObj;
    
            System.out.println("Unboxed Integer: " + intVal);
            System.out.println("Unboxed Double: " + doubleVal);
            System.out.println("Unboxed Character: " + charVal);
    
            // Using Wrapper class methods
            System.out.println("Integer as Binary: " + Integer.toBinaryString(num));
            System.out.println("Double to String: " + Double.toString(d));
            System.out.println("Character is Letter: " + Character.isLetter(c));
        }
    }
    