package dagiel.ClassesRepository.Chapter12;

/**
 * Created by dagiel on 26/01/2017.
 */
public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("Original value of iOB: " + iOb);
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        iOb2 = iOb + (iOb / 3);
        System.out.println("After expression iOb2 is : " + iOb);

        i = iOb + (iOb / 3);
        System.out.println("After expression i is : " + iOb);
    }
}
