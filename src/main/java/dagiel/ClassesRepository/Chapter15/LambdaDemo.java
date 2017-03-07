package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 06/03/2017.
 */
//functional interface -> has only one abstract method
interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; //interface reference
        myNum = () -> 123.34;
        System.out.println("A fixed value: " + myNum.getValue());
        myNum = () -> Math.random()*100;
        //2 x random value
        System.out.println("A random_1 value: " + myNum.getValue());
        System.out.println("A random_2 value: " + myNum.getValue());

    }
}
