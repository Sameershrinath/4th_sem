public class Lab1 { 

    // Constructor 
    public Lab1() {
        System.out.println("Class is activated !!");
    }

    // Overloaded methods
    public void Subject(String sub1, String sub2) {
        System.out.println("Subjects are " + sub1 + " and " + sub2);
    }

    public void Subject(int m1, int m2) { 
        System.out.println("Marks are " + m1 + " and " + m2);
    }

    public void Subject(int m1, int m2, int m3) { 
        System.out.println("Marks are " + m1 + ", " + m2 + ", and " + m3);
    }

    public void Subject(String s1, int m1, String s2, int m2) { 
        System.out.println("Marks in " + s1 + " is " + m1);
        System.out.println("Marks in " + s2 + " is " + m2);
    }

    public static void main(String[] args) {
        Lab1 var1 = new Lab1();

        // Call the overloaded methods
        var1.Subject("Maths", "Science");
        var1.Subject(45, 65);
        var1.Subject(45, 65, 53);
        var1.Subject("Maths", 45, "Science", 63);
    }
}
