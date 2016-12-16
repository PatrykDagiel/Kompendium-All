package dagiel.ClassesRepository.Chapter11;

/**
 * Created by dagiel on 2016-12-16.
 */
public class NewThreadJoin implements Runnable {
    String name;
    Thread t;

    NewThreadJoin(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Nowy watek: " + t);
        t.start();
    }

    public void run() {

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name +": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwano " + name);
        }
        System.out.println("Zakonczono " + name);
    }
}

class DemoJoin {
    public static void main(String[] args) {
        NewThreadJoin ob1 = new NewThreadJoin("Jeden");
        NewThreadJoin ob2 = new NewThreadJoin("Dwa");
        NewThreadJoin ob3 = new NewThreadJoin("Trzy");

        System.out.println("Watek jeden zyje: " + ob1.t.isAlive());
        System.out.println("Watek dwa zyje: " + ob2.t.isAlive());
        System.out.println("Watek trzy zyje: " + ob3.t.isAlive());

        try {
            System.out.println("Oczekiwanie na zakoczenie wątków: ");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Przerwano watek glowny");
        }

        System.out.println("Watek jeden zyje: " + ob1.t.isAlive());
        System.out.println("Watek dwa zyje: " + ob2.t.isAlive());
        System.out.println("Watek trzy zyje: " + ob3.t.isAlive());

        System.out.println("Zakonczono watek glowny");

    }
}
