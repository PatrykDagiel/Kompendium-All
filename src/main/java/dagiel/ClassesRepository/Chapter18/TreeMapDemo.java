package dagiel.ClassesRepository.Chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by dagiel on 07/04/2017.
 */

//TreeMap sorts its keys
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        tm.put("John Doe", new Double(3434.34));
        tm.put("Mr A", new Double(3434.34));
        tm.put("Mr B", new Double(3434.34));
        tm.put("Mrs C", new Double(3434.34));
        tm.put("Ms D", new Double(3434.34));

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("Mr A");
        tm.put("Mr A", balance + 2000);

        System.out.println("Mr A new balance is " + tm.get("Mr A"));
    }
}
