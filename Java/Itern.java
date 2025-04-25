public class Itern {
    public static void main(String[] args){
Student[] stu=new Student[3];

stu[0]=new Student("sameer");
stu[1]=new Student("sameer");
stu[2]=new Student("sameer");



for(Student nm:stu){
    nm.display();
}

    }
}

class Student{
    String name;

    Student(String name){
        this.name=name;
    }

    void display(){
        System.out.println(this.name);
    }
}