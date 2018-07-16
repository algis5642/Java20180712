package days.third;

import days.third.utils.NumberUtils;

import java.util.Scanner;

public class uzdavinysPenki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nuvaziuotiKM = NumberUtils.getCorrectNumber(scanner, "Iveskite nuvaziuota atstuma");
        double kuroSanaudos = NumberUtils.getCorrectNumber(scanner, "Iveskite sanaudas");
        double result = getVidSanaudos(nuvaziuotiKM, kuroSanaudos) ;
        System.out.println("Sanaudos 100 km : " + result);

    }
        public static double getVidSanaudos (double atstumas, double kuras){
        return ((kuras*100)/atstumas);

        }


}
