package days.third;

import days.third.utils.Calculator;
import days.third.utils.NumberUtils;

import java.util.Scanner;

public class uzdavinysSesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String line = "";
        while (!line.equals("q")) {

            System.out.println("Iveskite skaiciu ir matematini veiksma tarp ju + - * / ^ arba q kad baigti darba");
            line = scanner.nextLine();
            String[] itiems = line.split(" ");
            if (itiems.length == 3) {
                double numb1 = getNumber(scanner, itiems[0], "pakartokite pirmo sk ivedima");
                double numb2 = getNumber(scanner, itiems[2], "pakartokite antro sk ivedima");


                switch (itiems[1]) {
                    case "+":
                        double result = calculator.sum(numb1, numb2);
                        System.out.println("Suma " + result);
                        break;
                    case "-":

                        double resultm = calculator.minus(numb1, numb2);
                        System.out.println("Minus " + resultm);
                        break;
                    case "*":
                        double resultmul = calculator.multi(numb1, numb2);
                        System.out.println("Daugyba " + resultmul);
                        break;
                    case "/":
                        while (numb2 == 0) {
                            numb2 = NumberUtils.getCorrectNumber(scanner, "Dalyba is nulio negalima");
                        }

                        double resultd = calculator.divide(numb1, numb2);
                        System.out.println("Dalyba " + resultd);
                        break;
                    case "^":
                        double resultP = calculator.pow(numb1, numb2);
                        break;
                    default:
                        System.out.println("nepavyko nuskaityti zenklo");
                        break;
                }
            } else if (!line.equals("q")) {
                System.out.println("Blogas Formatas");
            }
        }
    }

    private static double getNumber(Scanner scanner, String numb, String message) {
        Double result;
        try {
            result = Double.parseDouble(numb);
        } catch (NumberFormatException e) {
            result = NumberUtils.getCorrectNumber(scanner, message);

        }
        return result;
    }


}




