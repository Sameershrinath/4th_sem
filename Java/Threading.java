class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Error occured");
            }
        }
    }
}

class WearMaskThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Wear Mask");
            try {
                Thread.sleep(5000); // 5 seconds
            } catch (InterruptedException e) {
                System.out.println("Error occured");
            }
        }
    }
}

class AreYouSafeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Are You Safe?");
            try {
                Thread.sleep(6000); // 6 seconds
            } catch (InterruptedException e) {
                System.out.println("Error occured");
            }
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        // Create thread objects
        HelloThread t1 = new HelloThread();
        WearMaskThread t2 = new WearMaskThread();
        AreYouSafeThread t3 = new AreYouSafeThread();

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
