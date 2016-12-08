package dagiel.ClassesRepository.Chapter11;

/**
 * Created by dagiel on 2016-12-08.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Aktualny watek + " + t);

        t.setName("Moj watek");
        System.out.println("Po zmianie nazwy " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Przerwanie glownego watku");
        }

    }
}
