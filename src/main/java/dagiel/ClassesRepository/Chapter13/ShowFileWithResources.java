package dagiel.ClassesRepository.Chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dagiel on 23/02/2017.
 */
public class ShowFileWithResources {
    public static void main(String[] args) {
        int i;
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(FileNotFoundException e) {
            System.out.println("No file found");
        } catch(IOException e) {
            System.out.println("IO Error occured");
        }

    }
}
