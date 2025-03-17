//7. Write a Java program to practice using String class and its methods.


public class Lab7 {
    public static void main(String[] args) {
        String str = " Hello Java ";

        System.out.println("Original: " + str);
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Length: " + str.length());
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replaced 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Substring (1-5): " + str.substring(1, 5));
    }
}