package pl.dpawlicki.workshops_1.cube_v2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

public class Dice_v2 {

    public static void main(String[] args) throws InterruptedException {

//        pisanie("W tej wersji kostki do gry wystarczy Twoja jedna komenda w konsoli. \n");
//        pisanie("Wzór będzie wyglądał następująco: \" xDy+z \".\n");
//        pisanie("x = ilość rzutów kostką,\n");
//        pisanie("y = rodzaj kostki,\n");
//        pisanie("z = modyfikator do rzutu.\n");
//        System.out.println();
//        TimeUnit.SECONDS.sleep(1);
        pisanie("W takim razie powiedz mi jak ma wyglądać rzut kością: ");
        Scanner scan = new Scanner(System.in);
        String commend = scan.nextLine();
        if (Character.isDigit(commend.charAt(0)) && commend.contains("+")) {
            String[] parts = commend.split("D");
            String part1 = parts[0];
            String partx = parts[1];
            String[] parts2 = partx.split("\\+");
            String part2 = parts2[0];
            String part3 = parts2[1];

            int x = Integer.parseInt(part1);
            int y = Integer.parseInt(part2);
            int z = Integer.parseInt(part3);

            System.out.println(x + " " + y + " " + z);

            Random rand = new Random();

            int wynik1 = x * (1 + rand.nextInt(y)) + z;
            int wynik2 = x * (1 + rand.nextInt(y)) + z;

            System.out.println(wynik1 + " " + wynik2);

        }

        if (Character.isDigit(commend.charAt(0)) && commend.contains("-")) {
            String[] parts = commend.split("D");
            String part1 = parts[0];
            String partx = parts[1];
            String[] parts2 = partx.split("\\-");
            String part2 = parts2[0];
            String part3 = parts2[1];

            int x = Integer.parseInt(part1);
            int y = Integer.parseInt(part2);
            int z = Integer.parseInt(part3);

            System.out.println(x + " " + y + " " + z);

            Random rand = new Random();

            int wynik1 = x * (1 + rand.nextInt(y)) + (-z);
            int wynik2 = x * (1 + rand.nextInt(y)) + (-z);

            System.out.println(wynik1 + " " + wynik2);
        }

    }

    static void pisanie(String str) throws InterruptedException {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
}
