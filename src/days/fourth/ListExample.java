package days.fourth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        List<String> names = new LinkedList<>();
        names.add("Petras");
        names.add("Jonas");
        names.add("Petras");
        names.add("Andrius");

        System.out.println(names);

        for (int i= 0 ; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        for (String name: names){
            System.out.println(name);
        }

        names.forEach(System.out::println);

        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jonas"));


        }
    }

