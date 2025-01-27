
// This is the demonstration of the Type conversion 

public class Main {
    public static void main(String[] args) {
        double Mydouble=9.78;
        int myint=(int) Mydouble;
        System.out.println(Mydouble);
        System.out.println(myint);

        //constructor
        ABC obj = new ABC();
        System.out.println(obj.name);
        System.out.println(obj.num);

        //Overloading
        System.out.println("GIving the two argument "+Add.add(5,10));
        System.out.println("Giving the three arguments "+Add.add(5,10,15));


    }
}

//This is the demonstration of the constructor in java

class ABC {
    int num=5;
    String name="sam";

ABC(){
    System.out.println("constructor is called .");
}
}


// Method overloading in java
class Add{
    static int add (int a, int b){
        return a+b;
    }
static int add(int a, int b , int c ){
    return a+b+b+c;
}
}