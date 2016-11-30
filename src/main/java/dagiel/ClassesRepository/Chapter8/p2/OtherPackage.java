package dagiel.ClassesRepository.Chapter8.p2;

/**
 * Created by dagiel on 2016-11-17.
 */
public class OtherPackage {
    OtherPackage() {
        dagiel.ClassesRepository.Chapter8.p1.Protection p = new dagiel.ClassesRepository.Chapter8.p1.Protection();
        System.out.println("Konstruktor z innego pakietu, widać tylko public " + p.n_pub);
    }
}
