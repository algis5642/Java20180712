package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UzdavinysTrecias {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String baigti;
        UzdavinysTrecias secondTask = new UzdavinysTrecias();
        do {
            System.out.println("Prasome pasirinkti figura\na-statusis trikampis\nb-staciakampis\nc-kvadratas\n-d apskritimas");

            String selection = scanner.nextLine();

            switch (selection) {
                case "a":
                    System.out.println(secondTask.statusTrikampis(scanner));

                    break;

                case "b":
                    System.out.println(secondTask.staciakampis(scanner));
                    break;

                case "c":
                    System.out.println(secondTask.kvadratoPlotas(scanner));

                    break;


                case "d":
                    System.out.println(secondTask.apskritimas(scanner));
                    break;

                default:
                    System.out.println("nera tokio metodo");
                    break;
            }
            System.out.println("Baigti ? t/n");
            baigti = scanner.nextLine();



        }while (!baigti.equals("t"));
    }

    private double statusTrikampis(Scanner scanner) {

        double a = getCorrectNumber(scanner, "Iveskite statini");

        double b = getCorrectNumber(scanner, "iveskite antra statini");
        return (a * b) / 2;


    }

    private double staciakampis(Scanner scanner) {

        double c = getCorrectNumber(scanner, "Iveskite krastine");

        double d = getCorrectNumber(scanner, "Iveskite antra statini");
        return (c * d);


    }

    private double kvadratoPlotas(Scanner scanner) {


        double e = getCorrectNumber(scanner, "Iveskite krastine");

        double f = getCorrectNumber(scanner, "iveskite antra krastine");
        return (e * f);


    }

    private double apskritimas(Scanner scanner) {


        double g = getCorrectNumber(scanner, "iveskite spinduli");
        return (3.1415 * g * g);
    }

    private double getCorrectNumber(Scanner sc, String message) {
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
