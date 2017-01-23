package dagiel.ClassesRepository.Chapter11;

/**
 * Created by dagiel on 23/01/2017.
 */
public class SuspendThread implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    SuspendThread(String threadname) {
        this.name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        suspendFlag = false;
        t.start();
    }

    public void run() {
        try {
            for(int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while(suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println("Exiting " + name);
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }


}

class SuspendResume {
    public static void main(String[] args) {
        SuspendThread ob1 = new SuspendThread("One");
        SuspendThread ob2 = new SuspendThread("Two");


        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending Thread One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming Thread One");
            ob2.mysuspend();
            System.out.println("Suspending Thread Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resuming Thread Two");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Exitin' main");
    }
}