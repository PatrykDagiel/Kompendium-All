package dagiel.ClassesRepository.Chapter11;

/**
 * Created by dagiel on 24/01/2017.
 */
public class Obliczenia {
    int wynik;
    int oblicz(int x) {
        wynik = x;
        if(x == 0) {
            System.out.println("Argument: 0");
            return 0;
        } else if(x == 1){
            System.out.println("Argument: 0");
            return 0;
        } else if(x == 2) {
            return 2;
        } else if (x % 2 == 0) {
            while(x > 2) {
                x -= 2;
                wynik *= x;
            }
            System.out.println("Wynik to " + wynik);
        } else if (x % 2 != 0) {
            while(x > 3 ) {
                x -= 2;
                wynik *= x;

            }
            System.out.println("Wynik to " + wynik);
        }
        return wynik;
    }

    Obliczenia() {
        this.wynik = 0;
    }

    public static void main(String[] args) {
        Obliczenia kontener = new Obliczenia();
        int argument = Integer.parseInt(args[0]);
        kontener.oblicz(argument);
    }
}
