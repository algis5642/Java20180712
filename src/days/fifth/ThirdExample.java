package days.fifth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThirdExample {

    private static final String FILE_NAME = "src/names.txt";

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        try(BufferedReader bf = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            while ((line = bf.readLine()) != null ){
                //System.out.println(line);
                names.add(line);
            }


        }catch (IOException e){
            System.out.println("Nenuskaitom " + e);
        }

        for (String name : names) {
            if (name.length() > 6) {
                System.out.println(name);
            }
        }





    }
}
