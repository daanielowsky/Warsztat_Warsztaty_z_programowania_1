package pl.dpawlicki.workshops_1.guess_number;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessNumberApp {

    public static void main(String[] args) throws InterruptedException {

        Random rand = new Random();
        int min = 0;
        int max = 0;
        int no = 1;

        Scanner scan = new Scanner(System.in);

        char[] chars = Character.toChars(0x1F608);
        String s = new String(chars);

        System.err.println("Zagrajmy w grę!");
        TimeUnit.MILLISECONDS.sleep(300);

        System.out.println("Najpierw zdecyduj w jakim przedziale liczbowym chcesz się bawić.");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print("Podaj minimalny zakres: ");
        min = scan.nextInt();
        System.out.print("Podaj maksymalny zakres: ");
        max = scan.nextInt();

        if (min > max) {
            System.err.println("Problemy z liczeniem. No rozumiem. Twoja minimalna liczba jest większa od największej możliwej. Spokojnie sam to już naprawię.");
            int tmp = max;
            max = min;
            min = tmp;
            TimeUnit.MILLISECONDS.sleep(800);
        }

        int randNumber = min + rand.nextInt(max + 1);

        System.out.println("Musisz zgadnąć liczbę wymyśloną przeze mnie. Liczba znajduje się w przedziale od " + min + " do " + max + ".");
        TimeUnit.MILLISECONDS.sleep(800);

        System.out.print("Spróbuj szczęścia i podaj swoją " + no + " liczbę " + s + " : ");

        int chosenNumber = 0;

        while (true) {
            chosenNumber = scan.nextInt();
            no++;
            if (chosenNumber > max) {
                System.out.println("Chyba ktoś ma problemy z pamięcią. Podałeś większą liczbę niż maksymalny zakres liczb.");
                System.out.print("Podaj swoją " + " liczbę: ");
            } else if (chosenNumber < min) {
                System.out.println("Chyba ktoś ma problemy z pamięcią. Podałeś mniejszą liczbę niż minimalny zakres liczb. ");
                System.out.print("Podaj swoją " + " liczbę: ");
            } else if (chosenNumber > randNumber) {
                System.err.print("Za dużo! Podaj swoją " + no + " liczbę: ");
            } else if (chosenNumber < randNumber) {
                System.err.print("Za mało! Podaj swoją " + no + " liczbę: ");
            } else {
                lettering("GRATULACJE! Udało Ci się zgadnąć liczbę.");
                break;
            }

        }
    }
    static void lettering(String str) throws InterruptedException {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            TimeUnit.MILLISECONDS.sleep(75);
        }
        System.out.println();
    }
}

