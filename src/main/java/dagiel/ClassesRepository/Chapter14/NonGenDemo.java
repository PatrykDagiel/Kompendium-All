package dagiel.ClassesRepository.Chapter14;

/**
 * Created by dagiel on 28/02/2017.
 */
class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }
    Object getObj() {
        return ob;
    }

    void showType() {
        System.out.println("Type of ob is " + ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;

        iob = new NonGen(88);
        iob.showType();

        int v = (Integer) iob.getObj();
        System.out.println("V value " + v);
        System.out.println();

        NonGen stringOb = new NonGen("Generics test");
        String str = (String) stringOb.getObj();
        System.out.println("String is " + str);

        iob = stringOb;
        v = (Integer) iob.getObj();

    }
}

