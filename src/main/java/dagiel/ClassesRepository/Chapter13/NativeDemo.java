package dagiel.ClassesRepository.Chapter13;

/**
 * Created by dagiel on 27/02/2017.
 */
public class NativeDemo {
    int i;
    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("Before native method ob.i is " + ob.i);
        ob.test();
        System.out.println("This is after native test " + ob.i);
    }
        public native void test();

        static {
            System.loadLibrary("NativeDemo");
        }
}

