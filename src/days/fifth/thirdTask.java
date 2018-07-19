package days.fifth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class thirdTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite savaites diena!! ");
        int numb = scanner.nextInt();

        Week week = Week.getWeekById(numb);

        System.out.println(week.name());
    }
}
