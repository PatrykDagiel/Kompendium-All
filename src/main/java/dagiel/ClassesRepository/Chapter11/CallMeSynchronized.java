package dagiel.ClassesRepository.Chapter11;

/**
 * Created by PatrykDagiel on 01.01.2017.
 */
public class CallMeSynchronized {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Przerwano");
        }
        System.out.print("]");
    }
}

class Caller2 implements Runnable {
    String msg;
    CallMeSynchronized target;
    Thread t;

    public Caller2(CallMeSynchronized targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}

class Synch1 {
    public static void main(String[] args) {
        CallMeSynchronized target = new CallMeSynchronized();
        Caller2 ob1 = new Caller2(target, "Witaj");
        Caller2 ob2 = new Caller2(target, "Zsynchronizowany");
        Caller2 ob3 = new Caller2(target, "Swiecie");
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Przerwano");
        }
    }
}
