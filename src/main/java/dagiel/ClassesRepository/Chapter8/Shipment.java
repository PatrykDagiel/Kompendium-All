package dagiel.ClassesRepository.Chapter8;

/**
 * Created by dagiel on 2016-11-16.
 */
public class Shipment extends BoxWeight {
    double cost;

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }



}
