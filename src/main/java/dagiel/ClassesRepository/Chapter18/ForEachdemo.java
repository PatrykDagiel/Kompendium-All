package dagiel.ClassesRepository.Chapter18;

import java.util.ArrayList;

/**
 * Created by dagiel on 05/04/2017.
 */
public class ForEachdemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<Integer>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        vals.add(6);
        System.out.print("Contents of vals: ");
        for(int v : vals)
            System.out.print(v + " ");
        System.out.println();
        int sum = 0;
        for(int v : vals)
            sum += v;
        System.out.println("Sum of values is " + sum);
    }
}
