package dagiel.ClassesRepository.Chapter8;

/**
 * Created by dagiel on 2016-11-17.
 */
public class Client implements Callback {
    public void callback(int p) {
        System.out.println("Wywolanie callback z zawartoscia " + p);
    }

    void nonIntMethod() {
        System.out.println("Metoda własna klasy implementujacej interfejs");
    }

}
