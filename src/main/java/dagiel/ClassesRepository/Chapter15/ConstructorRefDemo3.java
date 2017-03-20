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
    static<R,T> R myClassFactory(MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc5<MyClasss<Double>, Double> myClassCons = MyClasss<Double>::new;
        MyClasss<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Value in mc is " + mc.getVal());
        MyFunc5<MyClasss2, String> myClassCons2 = MyClasss2::new;
        MyClasss2 mc2 = myClassFactory(myClassCons2, "Lambda");
        System.out.println("Value str in mc2 is " + mc2.getVal());
    }
}
