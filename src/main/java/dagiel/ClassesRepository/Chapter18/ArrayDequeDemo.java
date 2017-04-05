package dagiel.ClassesRepository.Chapter18;

import java.util.ArrayDeque;

/**
 * Created by dagiel on 31/03/2017.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Popping the stack: ");
        while(adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();
    }
}
