package days.second;

import java.util.Scanner;

public class Uzduotys_2 {
    public static void main(String[] args) {


        String palindrome = "KOL EINU ŠUNIE LOK".replaceAll(" ", "");
        isPalindrome(palindrome);
        if (isPalindrome(palindrome)){
            System.out.println("Palindromas");

        }else {
            System.out.println("Nepalindomas");
        }



    }

    private static boolean isPalindrome(String palindrome) {


        boolean result = true ;
        for (int i = 0 ; i < palindrome.length(); i++){
            char a = palindrome.charAt(i);
            char b = palindrome.charAt(palindrome.length()-i-1);
            if (a != b){
                result= false;
                break;
            }
        }
        return result;

    }
}
