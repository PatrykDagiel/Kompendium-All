package dagiel.ClassesRepository.Chapter12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by dagiel on 06/02/2017.
 */

// Marker anno - can be applied to a type
@Target(ElementType.TYPE_USE)
@interface TypeAnno{}

// Marker anno - again for type
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}

// Same as above
@Target(ElementType.TYPE_USE)
@interface Unique {}

// Parametrized annotation that can be applied to a type
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// Parametrized annotation that can be applied to a type
@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK {}

@Target(ElementType.METHOD)
@interface Recommended {

}

class TypeAnnoDemo<@What(description = "Generic data type") T> {

    //Annotate type on constructor
    public @Unique TypeAnnoDemo() {}

    //Annotate type, not the field
    @TypeAnno String str;

    //Annotate field test
    @EmptyOK String test;

    // Type annotation to this
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }

    // Annotate return type
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    // Annotate method declaration
    public @Recommended Integer f3(String str) {
        return str.length() / 2;
    }

    // Type annotation with throw clause
    public void f4() throws @TypeAnno NullPointerException {

    }

    // Annotate array levels
    String @MaxLen(10) [] @NotZeroLen [] w;

    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {
        // Annotation for type argument
        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();

        // Annotation with new
        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = new Integer(10);
        Integer y;

        // Use a type annotation on cast
        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {}
}


