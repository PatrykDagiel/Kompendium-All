package dagiel.ClassesRepository.Chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by dagiel on 01/02/2017.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

public class Marker {
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("MyMarker annotation is present");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
