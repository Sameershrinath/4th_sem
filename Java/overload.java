//Overloading the values using different type

class Add{
    public static int add(int a, int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
}

public class overload {
    public static void main(String[] args) {
        System.out.println(Add.add(5,10));
        System.out.println(Add.add(5.1,10.1));
       
    }
    
}
