package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 17/03/2017.
 */
interface MyFunc5<R, T> {
    R func(T n);
}

class MyClasss<T> {
    private T val;
    MyClasss(T v) {
        val = v;
    }

    T getVal() {
        return val;
    }
}

class MyClasss2 {
    String str;
    MyClasss2(String s) {
        str = s;
    }

    String getVal() {
        return str;
    }

    

}

public class ConstructorRefDemo3 {

}
