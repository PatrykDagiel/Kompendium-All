package dagiel.ClassesRepository.Chapter10;

/**
 * Created by dagiel on 2016-12-06.
 */
public class MathNestTry {
    static void nestTry(int a) {
        try {
            if(a == 1) a = a / (a - a);
            if(a == 2) {
                int c[] = { 1 };
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Przekroczenie zakresu tablicy: " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            nestTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez zero: " + e);
        }
    }
}
