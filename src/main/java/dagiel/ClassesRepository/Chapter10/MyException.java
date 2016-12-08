package dagiel.ClassesRepository.Chapter10;

import java.lang.*;

/**
 * Created by dagiel on 2016-12-08.
 */
public class MyException extends java.lang.Exception {
    private int detail;

    public String toString() {
        return "MyException(" + detail + ")";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println(" Wywolanie compute(" + a + ")");
        if (a > 10)
            throw new MyException();
        System.out.println("Normalne wyjscie");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Zlapano + " + e);
        }
    }

}
