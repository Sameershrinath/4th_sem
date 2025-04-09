class Mythread extends Thread{
    public void run(){
        System.out.println("Thread started ");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("thread Interrupted.");
        }
        System.out.println("Thread finished");
    }
}

public class Multhread {
    
    public static void main(String[] args){
        Thread thread = new Thread();
        System.out.println(thread.isAlive());
        thread.start();
        thread.join();
        System.out.println(thread.isAlive());

    }
}
