package days.first;

import java.util.Scanner;

public class Uzduotys_2 {
    public static void main(String[] args) {

        System.out.println("Prasome ivesti zodi ar fraze polinomo tikrinimui:");
        Scanner scanner = new Scanner(System.in);
        checker(scanner);


    }

    private static void checker(Scanner scanner) {


        String x = scanner.next().replaceAll("\\s","");
        //x = scanner.nextLine().trim();
        System.out.println(x);

    }
}
