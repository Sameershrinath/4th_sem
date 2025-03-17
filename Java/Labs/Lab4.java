// Superclass
class Animal {
    String name;
    
    // Constructor
    Animal(String name) {
        this.name = name;
    }
    
    // Method
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    
    // Constructor
    Dog(String name) {
        super(name);
    }
    
    // Overriding method
    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof woof!");
    }
}

// Main class to demonstrate subclass usage
public class Lab4 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound();
    }
}
