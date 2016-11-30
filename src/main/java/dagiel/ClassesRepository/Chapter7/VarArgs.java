package dagiel.ClassesRepository.Chapter7;

/**
 * Created by dagiel on 2016-11-14.
 */
public class VarArgs {

    static void vaTest(int ... v) {
        System.out.println("vaTest(integer): " + "Liczba argumentów: " + v.length + " Zawartość: ");
        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean): " + "Liczba argumentów: " + v.length + " Zawartość: ");
        for (boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        vaTest(1, 2, 3);
        vaTest(true, false, true);

    }

}
