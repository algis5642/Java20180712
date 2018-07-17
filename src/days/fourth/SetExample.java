package days.fourth;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Jonas");
        names.add("Andrius");
        names.add("Petras");
        names.add("Jonas");
        names.add("Andrius");

        System.out.println(names.size());

        names.forEach(System.out::println);


    }
}
