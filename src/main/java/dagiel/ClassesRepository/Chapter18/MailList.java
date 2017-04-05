package dagiel.ClassesRepository.Chapter18;

import java.util.LinkedList;

/**
 * Created by dagiel on 05/04/2017.
 */

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }

}

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> lista = new LinkedList<Address>();
        lista.add(new Address("J. W. West", "XYZ", "ABC", "60", "100"));
        lista.add(new Address("J. W. East", "XYZ", "ABC", "900", "100"));

        for (Address element : lista)
            System.out.println(element + "\n");

    }


}
