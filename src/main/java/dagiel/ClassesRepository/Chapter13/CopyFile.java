package dagiel.ClassesRepository.Chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dagiel on 23/02/2017.
 */

/*
    Usage: java copyFile first.txt second.txt
 */

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if(args.length != 2) {
            System.out.println("Wrong amount of arguments. Usage: CopyFile From To");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException e2) {
                System.out.println("Error closing input file");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException e2) {
                System.out.println("Error closing Output file");
            }
        }
    }
}
