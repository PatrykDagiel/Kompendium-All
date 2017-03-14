package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 14/03/2017.
 */

public class LambdaAsArgumentsDemo {

    //Metoda z interfejsem funkcjonalnym jako pierwszym parametrem
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        String inStr = "Lambdas add power to Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("After upper case " + outStr);

        // Lambda jako parametr - przyklad
        outStr = stringOp((str) -> {
            String result = "";
            int i;

            for(i = 0; i < str.length(); i++)
                if(str.charAt(i) != ' ')
                    result+= str.charAt(i);
            return result;
        }, inStr);
        System.out.println("The string with spaces removed is " + outStr);

        StringFunc reverse = (str) -> {
            String result = "";
            int i = 0;
            for (i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println("The string reversed is: " + stringOp(reverse, inStr));
    }
}
