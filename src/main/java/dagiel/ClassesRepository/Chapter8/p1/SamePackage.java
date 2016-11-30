package dagiel.ClassesRepository.Chapter8.p1;

/**
 * Created by dagiel on 2016-11-17.
 */
public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Konstruktor z tego samego pakietu");
        System.out.println("n = " + p.n);
        System.out.println("Bez n_pri " + p.n_pro + " " + p.n + " " + p.n_pub);
    }
}
