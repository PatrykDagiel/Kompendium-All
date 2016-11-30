package dagiel.ClassesRepository.Chapter8.p1;

/**
 * Created by dagiel on 2016-11-17.
 */
public class Protection {
    int n = 4;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Konstrukcja klasy bazowej");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
