package dagiel.ClassesRepository.Chapter11;

/**
 * Created by PatrykDagiel on 19.12.2016.
 */
public class CallmeWithout {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Przerwano");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    CallmeWithout target;
    Thread t;

    public Caller(CallmeWithout targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        target.call(msg);
    }
}

class Synch {
    public static void main(String[] args) {
        CallmeWithout target = new CallmeWithout();
        Caller ob1 = new Caller(target, "Witaj");
        Caller ob2 = new Caller(target, "Zsynchronizowany");
        Caller ob3 = new Caller(target, "Swiecie");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.print("Przerwano");
        }

    }
}