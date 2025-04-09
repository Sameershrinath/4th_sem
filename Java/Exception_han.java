public class Exception_han {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
try{
   
throw new ArithmeticException("This is the new exception");}
catch(Interru e){
    System.out.println("Arthematic exception occured"+ e.getMessage());
}
finally{System.out.println("This will always run ");}
        
    }
    
}
