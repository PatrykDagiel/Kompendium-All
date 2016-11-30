package dagiel.ClassesRepository.Chapter8.p2;



/**
 * Created by dagiel on 2016-11-17.
 */
public class Protection2 extends dagiel.ClassesRepository.Chapter8.p1.Protection {
    Protection2() {
        System.out.println("Konstruktor klasy z innego pakietu");
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
