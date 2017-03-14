package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 14/03/2017.
 */
interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            int i;
            for(i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed is " + reverse.func("Lambda"));

        SomeFunc<Integer> counter = (n) -> {
            int result = 1;
            for(int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("The factorial of 3 is " + counter.func(3));

    }
}
