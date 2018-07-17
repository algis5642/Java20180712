package days.fourth;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        for (int i = 0 ; i < 5 ; i++){
            int e=i + 1;
            System.out.println("Prasome ivesti " + e + " varda");

            names.add(scanner.nextLine());

        }
        Collections.sort(names);

        System.out.println(names);


        names.forEach(System.out:: println);


        }

    }

