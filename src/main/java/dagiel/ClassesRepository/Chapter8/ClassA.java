package dagiel.ClassesRepository.Chapter8;

/**
 * Created by dagiel on 2016-11-17.
 */
public class ClassA {
    public interface NestedIf {
        boolean isNotNegative(int x);
    }
}

class B implements ClassA.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        ClassA.NestedIf nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("Liczba 10 nie jest ujemna");
        if(nif.isNotNegative(-12));
        System.out.println("Liczba -12 jest ujemna");

    }
}

