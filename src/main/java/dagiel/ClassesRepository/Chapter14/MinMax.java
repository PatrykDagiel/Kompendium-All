package dagiel.ClassesRepository.Chapter14;

import java.util.Comparator;

/**
 * Created by dagiel on 03/03/2017.
 */
public interface MinMax<T extends Comparable> {
    T min();
    T max();
}
