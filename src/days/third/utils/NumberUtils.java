package days.third.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtils {


    public static double getCorrectNumber(Scanner sc, String message) {
        double result;
        while (true) {

            System.out.println(message);
            try {
                result = sc.nextDouble();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nepavyko pakartokit");
                sc.nextLine();

            }

        }
        return result;

    }
}