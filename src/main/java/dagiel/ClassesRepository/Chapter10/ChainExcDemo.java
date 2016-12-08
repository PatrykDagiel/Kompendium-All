package dagiel.ClassesRepository.Chapter10;

/**
 * Created by dagiel on 2016-12-08.
 */
public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("najwyzszy poziom");

        e.initCause(new ArithmeticException("powod"));
        throw e;
    }

    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Zlapano " + e);

            System.out.println("Oryginalny powod: " + e.getCause());
        }
    }

}
