package dagiel.ClassesRepository.Chapter18;

import java.util.LinkedList;

/**
 * Created by dagiel on 30/03/2017.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("C");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("original content is " + ll);
        ll.remove(3);
        ll.remove("F");

        System.out.println("Content after deletion " + ll);
        String val = ll.get(2);
        ll.set(2, val + " Changed");

        System.out.println("LL after change " + ll);
    }
}
