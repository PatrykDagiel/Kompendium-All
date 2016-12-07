package dagiel.ClassesRepository.Chapter10;

import java.lang.*;

/**
 * Created by dagiel on 2016-12-07.
 */
public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("Wewnatrz procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("Finally z bloku procA");
        }
    }
    static void procB() {
        try {
            System.out.println("Wewnatrz procB");
            return;
        } finally {
            System.out.println("Finally z bloku procB");
        }
    }

    static void procC() {
        try {
            System.out.println("Wewnatrz procC");
        } finally {
            System.out.println("Finally z bloku procA");
        }
    }

    // Finally wykonuje sie zawsze niezaleznie od powodu opuszczenia instrukcji
    public static void main(String[] args) {
        try {
            procA();
        } catch (java.lang.Exception e) {
            System.out.println("Zlapanie wyjatku");
        }
        procB();
        procC();
    }


}
