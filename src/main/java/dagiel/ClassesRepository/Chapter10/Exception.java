package dagiel.ClassesRepository.Chapter10;

/**
 * Created by dagiel on 2016-12-05.
 */
public class Exception extends Throwable {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("Nie zostanie wyswietlone");
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez zero");
        }
        System.out.println("Po bloku try-catch");
    }
}
