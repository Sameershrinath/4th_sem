class Employee{
    String name;
    int age;
    float salary;


    public Employee(String name, int age, float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);

    }
}

public class Lab2{
    public static void main(String[] args) {
        Employee emp1=new Employee("sameer", 44, 45000);
        Employee emp2=new Employee("aman", 49, 55000);

        emp2.display();
        emp1.display();

       System.out.println( emp1.salary +" > "+ emp2.salary+ " is "+ (emp1.salary>emp2.salary));
    }
}