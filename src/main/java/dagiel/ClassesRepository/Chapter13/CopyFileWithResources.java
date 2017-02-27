package dagiel.ClassesRepository.Chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dagiel on 23/02/2017.
 */
public class CopyFileWithResources {
    public static void main(String[] args) throws IOException {
        int i;
        if(args.length != 2) {
            System.out.println("Wrong usage");
            return;
        }
        try(FileInputStream fin = new FileInputStream(args[0]); FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
