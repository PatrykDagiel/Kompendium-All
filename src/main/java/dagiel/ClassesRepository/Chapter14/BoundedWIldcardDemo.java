package dagiel.ClassesRepository.Chapter14;

/**
 * Created by dagiel on 01/03/2017.
 */
class TwoD {
    int x, y;
    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD{
    int z;

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourD extends ThreeD {
    int t;
    FourD(int a, int b, int c, int d) {
        super(a,b,c);
        t = d;
    }
}

class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] o) {
        coords = o;
    }
}

public class BoundedWIldcardDemo {
    static void showXY(Coords<?> c) {
        System.out.println("X Y coordinates");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z coordinates");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
    }

    static void showALL(Coords<? extends FourD> c) {
        System.out.println("X Y Z Time coordinates");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
    }

    public static void main(String[] args) {
        TwoD td[] = {
            new TwoD(0, 0),
            new TwoD(1, 7),
            new TwoD(2, 6),
            new TwoD(3, 5)
        };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        showXY(tdlocs);

        FourD fd[] = {
            new FourD(0, 1, 3, 12),
            new FourD(3, 5, 2, 12),
            new FourD(4, 6, 4, 12),
            new FourD(5, 8, 5, 12)
        };

        Coords<FourD> tdlocs2 = new Coords<FourD>(fd);
        showXY(tdlocs2);
        showXYZ(tdlocs2);
        showALL(tdlocs2);

    }

}
