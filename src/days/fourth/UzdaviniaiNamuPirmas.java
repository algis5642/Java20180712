package days.fourth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UzdaviniaiNamuPirmas {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Jonas");
        names.add("Petras");
        names.add("Antanas");
        names.add("Jokubas");
        names.add("Raimondas");

        Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);

        UzdaviniaiNamuPirmas f = new UzdaviniaiNamuPirmas();


        System.out.println(f.getFirst(names));
        System.out.println(f.getLast(names));

        for (Integer number : numbers)
            if (number >= 5 && number <= 10) {
                System.out.println(number);
            }


        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 6) {
                System.out.println(names.get(i));
            }


        }
    }

    private String getFirst(List<String> names) {
        return names.get(0);


    }

    private String getLast(List<String> names) {
        return names.get(names.size()-1);

    }
}

