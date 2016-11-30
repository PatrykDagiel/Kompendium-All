package dagiel.ClassesRepository.Chapter8;

import dagiel.ClassesRepository.Chapter8.Callback;

/**
 * Created by dagiel on 2016-11-17.
 */
public class Client2 implements Callback {
        public void callback(int p) {
            System.out.println("Wywolanie callback z Client2 z zawartoscia " + p);
        }

}
