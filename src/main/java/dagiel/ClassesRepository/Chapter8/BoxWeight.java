package dagiel.ClassesRepository.Chapter8;

/**
 * Created by dagiel on 2016-11-16.
 */
public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    public BoxWeight() {
        width = -1;
        height = -1;
        depth = -1;
    }

    public BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
}
