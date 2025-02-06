// public class Main{
//     public static void main(String[] args){
//         int my_int=45;
//         System.out.println("The number in int is :"+my_int);
//     }
// }


// public class Main{
//     public  int add(int num1, int num2){
//         return (num1+num2);
//     }

//     public int add(int num1, int num2, int num3){
//         return (num1+num2+num3);
//     }

//     public static void main(String[] args){
//         Main var1=new Main();
//         System.out.println(var1.add(1,2,3));
//         System.out.println(var1.add(1,2));

//     }
// }



public class Main{
int num1;
String name;

    public Main(int num1,String name){
        System.out.println("Hello I am being called as constructor."+"Name : "+ name + num1 );
    }
    public static void main(String[] args){
        Main var1=new Main();

    }
}