package days.first;

import java.util.Scanner;

public class Uzduotys_1 {

    public static void main(String[] args) {


        System.out.println("iveskite zodi");
        Scanner scanner = new Scanner(System.in);
// dadadad   dadaddd

        getCorrectWord(scanner);



    }
    private static void getCorrectWord(Scanner sc){
        String word;
        do {
            System.out.println("iveskite zodi");
            word = sc.nextLine().toLowerCase();
            printWord(word);

        }while (!word.equals( "pabaiga") );

    }

    private static void printWord(String word){
        int count = countLetters(word, 'a');
        if (word.length() % 2 == 0) {
            System.out.println("Ivestas zodis " + word + " lyginis: ilgis" + word.length()+ "a raidziu " +count);
        }else {
            System.out.println("Ivestas zodis " + word + " nelyginis: ilgis " + word.length()+  " a raidziu " + count);
        }

    }
    private static int countLetters(String word, char letter){
        int result= 0;
        for (int i = 0; i< word.length(); i++){
            char temp = word.charAt(i);
            if ( letter == temp){
                result++;
            }

        }
        return result;
    }

}

