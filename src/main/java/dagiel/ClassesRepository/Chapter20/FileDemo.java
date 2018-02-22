package dagiel.ClassesRepository.Chapter20;

import java.io.File;

public class FileDemo {

     static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT");
        p("Nazwa pliku: " + f1.getName());
        p("Sciezka: " + f1.getPath());
        p("Sciezka bezwzgledna: " + f1.getAbsolutePath());
        p("Katalog macierzysty: " + f1.getParent());
        p(f1.exists() ? "Plik istnieje" : "Plik nie istnieje");
        p(f1.canWrite() ? "Jest dostepny do zapisu" : "Nie jest dostepny do zapisu");
        p(f1.isDirectory() ? "Jest katalogiem" : "Nie jest katalogiem");
        p(f1.isFile() ? "Jest normalnym plikiem" : "Moze byc otwartym potokiem");
        p(f1.isAbsolute() ? "Jest bezwzgledny" : "Jest wzgledny");
        p("Ostatnia modyfikacja pliku: " + f1.lastModified());
        p("Rozmiar pliku: " + f1.length() + " bajtow");

    }
}
