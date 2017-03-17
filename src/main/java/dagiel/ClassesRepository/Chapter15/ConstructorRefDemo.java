package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 17/03/2017.
 */
interface MyFunc4 {
    MyClass func(int n);
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass::new;
        MyClass mc = myClassCons.func(100);

        System.out.println("Val in mc is " + mc.getVal());
    }
}
