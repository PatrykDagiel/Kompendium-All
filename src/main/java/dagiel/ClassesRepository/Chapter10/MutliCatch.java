package dagiel.ClassesRepository.Chapter10;

/**
 * Created by dagiel on 2016-12-06.
 */
public class MutliCatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = { 1 };
            c[42] = 99;
        } catch(ArithmeticException e) {
            System.out.println("Dzielenie przez zero: " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks pozą granicą: " + e);
        }
        System.out.println("Po blokach try i catch");
    }
}
