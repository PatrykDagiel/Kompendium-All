package dagiel.ClassesRepository.Chapter11;

/**
 * Created by dagiel on 2016-12-08.
 */
public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Przykladowy watek");
        System.out.println("Watek potomny " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Watek potomny " + i);
                Thread.sleep(1700);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwano dzialanie potomka");
        }
        System.out.println("Wyjscie z bloku potomka");
    }

    static class ThreadDemo {
        public static void main(String[] args) {
            new NewThread();

            try {
                for(int i = 5; i > 0; i--) {
                    System.out.println("Watek glowny " + i);
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                System.out.println("Przerwanie watku glownego");
            }
            System.out.println("Wyjscie z watku glownego");
        }
    }

}
