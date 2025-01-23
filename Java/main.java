public class main {
    int x = 5;

    public static void main(String[] args) {
        main myobj = new main();
        System.out.println(myobj.x);
    }
}
// The main method is a special method in java programming that serves as
// externally exposed entrance point by which a java program can be run.

/*
To compile a java program you dont need any main method in java program but
while execution JVM (java virtual machine) searches for the main method and
starts executing from it.

 The main method must be public it means that you can call this method from outside the class
  you ae currently in.
  Since its a static method also void so it must not return any value and it must accept a string array as a parameter



  Data types in java
  ->Primitive
  boolean 1 bit
  char 2 byte
  byte 1 byte
  int 4 byte
  long 8 byte
  float 4 byte
  double 8 byte
  short 2 byte

  ->Non primitive data type includes classes interfaces and arrays

 */

