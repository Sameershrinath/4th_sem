public class Return {
    public static void main(String[] args) {
        int age=20;
        System.out.println("Using Return only this line will be executed.");
        if (age<18){
            return;
        }
        System.out.println("This line will not be executed.");
    }
    
}
