package dagiel.ClassesRepository.Chapter14;

/**
 * Created by dagiel on 28/02/2017.
 */
class TwoGen<T, V> {
    T ob1;
    V ob2;


    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName() + " and type of V is " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}


public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showTypes();

        int v = tgObj.getob1();
        System.out.println("v is " + v);

        String str = tgObj.getob2();
        System.out.println("str is " + v);
    }
}
