package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 06/03/2017.
 */
interface NumericTest2 {
    boolean test(int n, int d);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if(isFactor.test(10, 2))
            System.out.println("2 is factor of 10");

        if(!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
    }
}
