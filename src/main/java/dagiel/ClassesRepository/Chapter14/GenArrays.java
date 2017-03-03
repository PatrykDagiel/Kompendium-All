package dagiel.ClassesRepository.Chapter14;

/**
 * Created by dagiel on 03/03/2017.
 */
class GenN<T extends Number> {
    T ob;
    T vals[];

    GenN(T o, T[] nums) {
        ob = o;
        vals = nums;
    }
}

public class GenArrays {
    public static void main(String[] args) {
        Integer n[] = {1, 2, 3, 4, 5};
        GenN<Integer> iOb = new GenN<Integer>(50, n);
        //nie mozna stworzyc tablicy referencji do generyków
        // GenN<Integer> gens[] = new GenN<Integer>(50, iOb) za tmo można:
        GenN<?> gens[] = new GenN<?>[10];
    }
}
