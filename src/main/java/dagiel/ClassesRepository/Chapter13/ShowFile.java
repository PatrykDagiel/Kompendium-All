package dagiel.ClassesRepository.Chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dagiel on 20/02/2017.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        //Specify a filename - check
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot open file");
            return;
        }

        //Read from file
        try {
            do {
                i = fin.read();
                if(i!= -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Error Reading File");
        }

        try {
            fin.close();
        } catch(IOException e) {
            System.out.println("Error closing file");
        }

    }
}
