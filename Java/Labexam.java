class Student{
String name;
int age;
int marks;

    Student(String name,int age){
        System.out.println(name+age);
    }
    Student(String name,int age, int marks){
        System.out.println(name+age+ marks);
    }

}

public class Labexam{

    public static void main (String[] args){
        Student var1=new Student("sameer shrinath", 21);
        Student var2=new Student("sameer shrinath", 21,23);
    }
}