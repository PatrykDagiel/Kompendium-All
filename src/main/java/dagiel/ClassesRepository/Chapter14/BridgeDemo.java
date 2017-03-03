package dagiel.ClassesRepository.Chapter14;

/**
 * Created by dagiel on 03/03/2017.
 */
class Genx<T> {
    T ob;

    Genx(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class Gen2 extends Genx<String> {
    Gen2(String o) {
        super(o);
    }

    String getob() {
        System.out.print("You called String getob(): ");
        return ob;
    }
}


public class BridgeDemo {
    public static void main(String args[]) {
        Gen2 strOb2 = new Gen2("Generics test");
        System.out.println(strOb2.getob());
    }
}
