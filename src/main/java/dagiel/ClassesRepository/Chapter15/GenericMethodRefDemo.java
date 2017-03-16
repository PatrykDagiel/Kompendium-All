package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 16/03/2017.
 */
interface MyFunc3<T> {
    int func(T[] vals, T v);
}

class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for(int i = 0; i < vals.length; i++)
            if(vals[i] == v) count++;
        return count;
    }
}

public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {

    }
}
