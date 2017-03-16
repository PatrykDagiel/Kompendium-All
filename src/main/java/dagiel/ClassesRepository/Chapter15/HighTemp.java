package dagiel.ClassesRepository.Chapter15;

/**
 * Created by dagiel on 16/03/2017.
 */
interface MyFunc2<T> {
    boolean func(T v1, T v2);
}

public class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc2<T> f, T v) {
        int count = 0;
        for(int i = 0; i < vals.length; i++) {
            if(f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {
            new HighTemp(89), new HighTemp(82),
            new HighTemp(89), new HighTemp(82),
            new HighTemp(99), new HighTemp(37),
            new HighTemp(85), new HighTemp(93),
            new HighTemp(89), new HighTemp(57)
        };

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println(count + " days had a high of 89");

        HighTemp[] weekDayHighs2 = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(89), new HighTemp(82),
                new HighTemp(99), new HighTemp(37),
                new HighTemp(85), new HighTemp(93),
                new HighTemp(89), new HighTemp(57)
        };

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(37));
        System.out.println(count + " days had a high of 37");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(40));
        System.out.println(count + " days had temperature lower than 40");

    }

}
