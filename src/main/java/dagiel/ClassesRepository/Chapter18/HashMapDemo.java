package dagiel.ClassesRepository.Chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by dagiel on 06/04/2017.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("John Doe", new Double(3434.34));
        hm.put("Chris Hill", new Double(2000.34));
        hm.put("Stephen Rouine", new Double(1000.34));
        hm.put("Pattoriko Dag", new Double(8777.34));

        //Get a set of the entriws
        Set<Map.Entry<String, Double> set = hm.entrySet();
        System.out.println();
    }
}
