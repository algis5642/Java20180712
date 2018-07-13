package days.first;

public class WelcomeClass {

    public static void main(String[] args) {
        int a = 10;
        int b =  minus(12,6);

        WelcomeClass welcomeClass = new WelcomeClass();
        welcomeClass.printName("Petras");



        System.out.println(b);
        System.out.println(a);

    }

    private void printName(String name){
        //sout
        System.out.println( name);

    }

    private  static int minus(int numb1, int numb2){
        return numb1-numb2;

    }
}
