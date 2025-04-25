public class Array {
    public static void main (String[] args){
        Student[] stu=new Student[3];

        stu[0]=new Student("sameer");
        stu[1]=new Student("pranjal");
        stu[2]=new Student("aniket");

for (int i=0; i<3;i++){
    stu[i].display();
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