package dagiel.ClassesRepository.Chapter15;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dagiel on 16/03/2017.
 */

class MyClass {
    private int val;

    MyClass(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }

}

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> lista = new ArrayList<MyClass>();
        lista.add(new MyClass(1));
        lista.add(new MyClass(2));
        lista.add(new MyClass(3));
        lista.add(new MyClass(4));
        lista.add(new MyClass(5));
        lista.add(new MyClass(6));

        MyClass maxValObj = Collections.max(lista, UseMethodRef::compareMC);
        System.out.println("Maximum value is: " + maxValObj.getVal());
    }

}
