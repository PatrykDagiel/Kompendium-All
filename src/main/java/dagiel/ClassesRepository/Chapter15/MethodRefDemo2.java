package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 16/03/2017.
 */
class MyStringOps2 {
    String strReverse(String str) {
        String result = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

public class MethodRefDemo2 {
    //Metoda z interfejsem funkcyjnym jako pierwszym typem parametru
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas add power to java";
        String outStr;

        MyStringOps2 strOps = new MyStringOps2();
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Original string" + inStr);
        System.out.println("String reversed " + outStr);
    }
}
