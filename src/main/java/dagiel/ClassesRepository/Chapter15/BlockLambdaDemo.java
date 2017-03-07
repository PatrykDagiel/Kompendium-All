package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 06/03/2017.
 */
interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for(int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("The factorial of 10 is " + factorial.func(10));
    }
}
