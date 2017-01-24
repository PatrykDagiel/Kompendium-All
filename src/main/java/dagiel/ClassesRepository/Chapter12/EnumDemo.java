package dagiel.ClassesRepository.Chapter12;

import static dagiel.ClassesRepository.Chapter12.Apple.Jonatan;

/**
 * Created by dagiel on 24/01/2017.
 */
enum Apple {
    Jonatan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        // Output an enum value
        System.out.println("Value of ap: " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel)
            System.out.println("Ap contains GoldenDen");

        switch (ap) {
            case Jonatan:
                System.out.println("Jonathan is red");
                break;
            case GoldenDel:
                System.out.println("GoldenDen is yellow");
                break;
            case Winesap:
                System.out.println("Winesap is red");
                break;
            case RedDel:
                System.out.println("Red Delicious is red");
                break;
            case Cortland:
                System.out.println("Cortland is red");
                break;
        }
    }
}