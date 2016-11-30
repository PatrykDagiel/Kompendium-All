package dagiel.ClassesRepository.Chapter8;

/**
 * Created by dagiel on 2016-11-16.
 */
public class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        System.out.println("Pole figury nie jest zdefiniowane");
        return 0;
    }
}

class Rectangle extends  Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Wewnatrz metody area() dla rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends  Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        System.out.println("Wewnatrz metody area() dla triangle");
        return dim1 * dim2/2;
    }
}

class FindAreas{
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 6);
        Triangle t = new Triangle(30, 4);

        Figure figureRef;

        figureRef = r;
        System.out.println("Pole: " + figureRef.area());
        figureRef = t;
        System.out.println("Pole: " + figureRef.area());
        figureRef = f;
        System.out.println("Pole: " + figureRef.area());
    }
}
