package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 15/03/2017.
 */
public interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String[] args) {
        int num = 10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
            // num++;
            return v;
        };
    }
}
