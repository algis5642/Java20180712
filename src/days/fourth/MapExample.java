package days.fourth;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public MapExample() {
        //ConstructorExample constructorExample = new ConstructorExample();

    }

    public static void main(String[] args) {
        Map<Integer,String > names = new TreeMap<>();
        names.put(2, "Andrius");
        names.put(3, "Jonas");
        names.put(1, "Petras");
        names.put(5, "Alfonsas");
        names.put(5, "Jakobas");

        System.out.println(names.size());

        for (Integer key : names.keySet()){
            System.out.println("key "+ key + "  " + names.get(key));


        }
        System.out.println(names.get(2));
        ConstructorExample constructorExample = new ConstructorExample();
    }
}
