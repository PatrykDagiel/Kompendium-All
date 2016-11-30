package dagiel.ClassesRepository.Chapter8;

/**
 * Created by dagiel on 2016-11-16.
 */
public class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 8.34);
        double vol;

        vol = mybox1.volume();
        System.out.println("Objetosc mybox1 = " + vol);
        System.out.println("Ciężar mybox1 = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Objetosc mybox2 = " + vol);
        System.out.println("Ciężar mybox2 = " + mybox1.weight);
    }
}
