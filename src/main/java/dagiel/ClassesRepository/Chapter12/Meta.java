package dagiel.ClassesRepository.Chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * Created by dagiel on 30/01/2017.
 */

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Testing";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}
@What(description = "Annotation test class")
@MyAnno(str = "Annotation example", val = 100)
public class Meta {
    @What(description = "test for method")
    @MyAnno(str = "Annotation example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("All annotations are: ");
            for(Annotation a : annos)
                System.out.println(a);
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All annotations for MyMeth are: ");
            for(Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("No such method found");
        }
    }




    public static void main(String[] args) {
        myMeth();
    }
}
