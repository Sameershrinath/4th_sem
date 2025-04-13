public class Adder {

    public static void main(String[] args){
int sum=0;
int num=456;

while (num!=0){
    sum=sum+(num%10);
    num=num/10;
}

System.out.println(sum);

}
    
}
