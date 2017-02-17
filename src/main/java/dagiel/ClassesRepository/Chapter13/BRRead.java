package dagiel.ClassesRepository.Chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dagiel on 17/02/2017.
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters q to quit");

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
