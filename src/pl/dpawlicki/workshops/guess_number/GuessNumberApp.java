package pl.dpawlicki.workshops.guess_number;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessNumberApp {

    public static void main(String[] args) throws InterruptedException {

        Random rand = new Random();
        int min = 1;
        int max = 101;
        int randNumber = min + rand.nextInt(max - min);
        int no = 1;
        char[] chars = Character.toChars(0x1F608);
        String s = new String(chars);
        System.err.println("Zagrajmy w grę!");
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println("Musisz zgadnąć liczbę wymyśloną przeze mnie. Liczba znajduje się w przedziale od " + min + " do " + max);
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.print("Spróbuj szczęścia i podaj swoją " + no + " liczbę " + s + " : ");
        int chosenNumber = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            chosenNumber = scan.nextInt();
            no++;
            if (chosenNumber > randNumber) {
                System.err.print("Za dużo! Podaj swoją " + no + " liczbę: ");
            } else if (chosenNumber < randNumber) {
                System.err.print("Za mało! Podaj swoją " + no + " liczbę: ");
            } else {
                System.out.println("GRATULACJE! Udało Ci się zgadnąć liczbę");
                break;
            }

        }
    }
}
