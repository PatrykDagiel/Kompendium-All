package dagiel.ClassesRepository.Chapter10;

/**
 * Created by dagiel on 2016-12-07.
 */
public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException(("demo"));
        } catch(NullPointerException e) {
            System.out.println("Zlapanie wewnatrz metody demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Ponowne zlapanie: " + e);
        }
    }

}
