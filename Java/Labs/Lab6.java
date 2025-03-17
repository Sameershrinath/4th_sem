//6. Write a Java Program to implement array of objects.

// Class representing a Student
class Student {
    String name;
    int age;
    double marks;

    // Constructor
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

// Main class
public class Lab6 {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];

        // Initializing objects in the array
        students[0] = new Student("Samir", 20, 95.5);
        students[1] = new Student("Anchal", 21, 78.0);
        students[2] = new Student("Sonal", 19, 92.3);

        // Displaying student details
        System.out.println("Student Details:");
        for (Student student : students) {
            student.display();
        }
    }
}
