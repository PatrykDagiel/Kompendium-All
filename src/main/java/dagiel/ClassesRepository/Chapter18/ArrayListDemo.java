package dagiel.ClassesRepository.Chapter18;

import java.util.ArrayList;

/**
 * Created by dagiel on 30/03/2017.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("initial size of al: " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Contents of al is " + al);
        System.out.println("Size of al after additions is " + al.size());

        al.remove("F");
        al.remove(2);

        System.out.println("Contents of al is " + al);

    }
}
