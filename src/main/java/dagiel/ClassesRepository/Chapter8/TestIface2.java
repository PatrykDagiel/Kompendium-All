package dagiel.ClassesRepository.Chapter8;

/**
 * Created by dagiel on 2016-11-17.
 */
public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        Client2 d = new Client2();

        c.callback(42);
        c = d;
        c.callback(42);
    }

}
