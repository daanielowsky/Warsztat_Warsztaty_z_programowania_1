package pl.dpawlicki.workshops_1.lotto;

import java.sql.Time;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LottoApp {

    public static void main(String[] args) throws InterruptedException {

        Integer[] arr = new Integer[49];
        for (int z = 0; z < arr.length; z++) {
            arr[z] = z + 1;
        }
        Collections.shuffle(Arrays.asList(arr));

        int[] yourNumbers = new int[6];
        int number = 0;


        lettering("Dzisiaj zagramy w Lotto!");
        System.out.println("Sprawdźmy czy masz dzisiaj szczęście.");
        System.out.print("Podaj swoje liczby do losowania: ");
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int j = 0;
        while (j < 6) {
            System.out.print("Podaj swoją " + i + " liczbę: ");
            number = scan.nextInt();
            yourNumbers[j] = number;
            System.out.println(Arrays.toString(yourNumbers));
            i++;
            j++;
        }
        System.out.println();
        TimeUnit.MILLISECONDS.sleep(450);
        System.out.println("Wylosowane liczby to:");
        System.out.println();
        lettering(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4] + " " + arr[5]);
        System.out.println();
        int win = 0;
        for (int ch = 0; ch < yourNumbers.length; ch++) {
            for (int hc = 0; hc < yourNumbers.length; hc++) {
                if (arr[ch] == yourNumbers[hc]) {
                    win++;
                }
            }
        }
        if (win >= 3) {
            System.out.println("Gratulacj! Trafiłeś " + win + " liczby!");
        } else {
            System.out.println("Spróbuj szczęścia innym razem. Trafiłeś " + win + " liczb.");
        }
    }

    static void lettering(String str) throws InterruptedException {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            TimeUnit.MILLISECONDS.sleep(200);
        }
        System.out.println();
    }
}
