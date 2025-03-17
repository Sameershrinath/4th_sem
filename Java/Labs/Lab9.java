//9. Write a Java Program to implement Vector class and its methods.

import java.util.Vector;
public class Lab9 {
    

    public static void main(String[] args) {
        // Creating a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        System.out.println("Vector: " + vector);

        // Inserting an element at a specific index
        vector.add(1, "Mango");
        System.out.println("After insert: " + vector);

        // Getting an element by index
        System.out.println("Element at index 2: " + vector.get(2));

        // Removing an element
        vector.remove("Banana");
        System.out.println("After removal: " + vector);

        // Checking if an element exists
        System.out.println("Contains 'Apple': " + vector.contains("Apple"));

        // Getting the size of the Vector
        System.out.println("Size: " + vector.size());

        // Iterating through the Vector
        System.out.print("Elements: ");
        for (String fruit : vector) {
            System.out.print(fruit + " ");
        }
    }
}
