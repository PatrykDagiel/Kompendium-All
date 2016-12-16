package dagiel.ClassesRepository.Chapter11;

/**
 * Created by dagiel on 2016-12-09.
 */
public class NewThread2 implements Runnable {

    String name;
    Thread t;

    NewThread2(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Nowy watek + " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwano " + name);
        }
    }
}

    class MultiThreadDemo {
        public static void main(String[] args) {
            new NewThread2("Jeden");
            new NewThread2("Dwa");
            new NewThread2("Trzy");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Koniec watku glownego");
            }
        }
    }

