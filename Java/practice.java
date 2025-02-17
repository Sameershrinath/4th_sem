
// Example of the method overloading 
// public class Main{
//     public static void add(int a, int b){
//         System.out.println(a+b);
//     }
//     public static void add(int a, int b,int c){
//         System.out.println(a+b+c);
//     }

//     public static void main (String[] args){
//         add(5, 10);
//         add(5, 10,15);
//     }
// }


// Example of the Object creation
// public class Main{
//     public void add(int a, int b){
//         System.out.println(a+b);
//     }
//     public void add(int a, int b,int c){
//         System.out.println(a+b+c);
//     }

//     public static void main (String[] args){
//         Main var1=new Main();

//         var1.add(45,1);
//         var1.add(45,5,9);
    
//     }
// }



//Example of the implicit type conversion

// public class Main {
//     public static double add(double a, double b){
//        return(a+b);
//     }
//     public static void main(String[] args){
//         int num1=45;
//         int num2=46;
//         double num3=add(num1,num2);
//         System.out.println(num3);
//     }
// }





public class Main{

    public static  class Check{ 
        int num1=45;
        int num2=1;
        Check(){
            System.out.println("This line is called");
        }
    }
    public static void main(String[] args) {
        Check var1=new Check();
    }
   
}

