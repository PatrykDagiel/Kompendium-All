package dagiel.ClassesRepository.Chapter13;

import java.io.PrintWriter;

/**
 * Created by dagiel on 20/02/2017.
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("This is a string");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
