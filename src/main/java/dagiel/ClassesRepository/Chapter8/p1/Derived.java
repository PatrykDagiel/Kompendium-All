package dagiel.ClassesRepository.Chapter8.p1;

/**
 * Created by dagiel on 2016-11-17.
 */
public class Derived extends Protection {
    Derived() {
        System.out.println("Konstruktor podklasy\n");
        System.out.println("Bez n_pri " + n_pro + " " + n + " " + n_pub);
    }
}
