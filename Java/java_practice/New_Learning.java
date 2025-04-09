public class New_Learning{


public static void main (String[] args){
World var1=new World();

System.out.println(var1.getState());
var1.start();
System.out.println(var1.getState());

}
}
class World extends Thread{
public void run(){
for(int i=0;i<1000000;i++){
 try{
Thread.sleep(1000);
}
catch(InterruptedException e){
System.out.println("Error occured while execution");
}


System.out.println(i);
}
}
}
