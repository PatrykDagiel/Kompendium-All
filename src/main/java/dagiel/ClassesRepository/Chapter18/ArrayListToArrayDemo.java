package dagiel.ClassesRepository.Chapter18;

import java.util.ArrayList;

/**
 * Created by dagiel on 30/03/2017.
 */
public class ArrayListToArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al: " + al);

        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);

        int sum = 0;
        for(int i : ia) sum += i;

        System.out.println("Sum is " + sum);
    }
}
