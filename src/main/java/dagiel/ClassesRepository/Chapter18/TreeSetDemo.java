package dagiel.ClassesRepository.Chapter18;

import java.util.TreeSet;

/**
 * Created by dagiel on 31/03/2017.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("C");
        ts.add("B");
        ts.add("A");
        ts.add("Z");
        ts.add("X");
        ts.add("W");
        System.out.println(ts);
        //C inclusive, F exclusive !!!!
        System.out.println(ts.subSet("C", "F"));
    }
}
