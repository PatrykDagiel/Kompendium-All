package dagiel.ClassesRepository.Chapter12;

import java.util.Random;

/**
 * Created by dagiel on 25/01/2017.
 */
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

public class Question {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100* rand.nextDouble());

    }
}
