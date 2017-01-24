package dagiel.ClassesRepository.Chapter12;

/**
 * Created by dagiel on 24/01/2017.
 */
enum Apples {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;
    Apples(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

}

public class EnumDemo3 {
    public static void main(String[] args){
        Apples ap;
        System.out.println("Winesap costs " + Apples.Winesap.getPrice() + " cents.");

        for(Apples a : Apples.values())
            System.out.println(a + "costs " + a.getPrice() + " cents.");
    }
}
