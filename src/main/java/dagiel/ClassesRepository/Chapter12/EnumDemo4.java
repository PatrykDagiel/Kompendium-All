package dagiel.ClassesRepository.Chapter12;

/**
 * Created by dagiel on 25/01/2017.
 */
public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("here are all apple constants with values: ");
        for(Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        if(ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);
        if(ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);
        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);
        if(ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}
