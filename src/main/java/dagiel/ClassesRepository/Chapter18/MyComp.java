package dagiel.ClassesRepository.Chapter18;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by dagiel on 07/04/2017.
 */
public class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return bStr.compareTo(aStr);
    }


}

class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("Z");
        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
