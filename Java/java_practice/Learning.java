public class Learning{


public static void main (String[] args)
{
Counting var1=new Counting();
Counting2 var2=new Counting2();

var1.start();
var2.start();
for(;;){
System.out.println("hello world");
}
}
}


public class Counting extends Thread{
public void run(){


for(int i=0;i<100;i++){
System.out.println("hello world bt the thread");
}
System.out.println("I am java thread");
}
}
public class Counting2 extends Thread{
public void run(){

for(int i=0;i<100;i++){
System.out.println(i);
}
}
}
