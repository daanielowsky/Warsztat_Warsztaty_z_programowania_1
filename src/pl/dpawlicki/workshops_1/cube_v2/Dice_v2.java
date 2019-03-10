package pl.dpawlicki.workshops_1.cube_v2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

public class Dice_v2 {

    public static void main(String[] args) throws InterruptedException {

        pisanie("W tej wersji kostki do gry wystarczy Twoja jedna komenda w konsoli. \n");
        pisanie("Wzór będzie wyglądał następująco: \" xDy+z \".\n");
        pisanie("x = ilość rzutów kostką,\n");
        pisanie("y = rodzaj kostki,\n");
        pisanie("z = modyfikator do rzutu.\n");
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
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

            int finish = 0;

            for (int i = 1; i <= x; i++) {
                int wynik = (1 + rand.nextInt(y));
                System.out.print("Wynik " + i + " rzutu kością: ");
                System.out.println(wynik);
                finish += wynik;
            }

            finish += z;
            System.out.println("Wynik rzutów to: " + finish);

        } else if (Character.isDigit(commend.charAt(0)) && commend.contains("-")) {
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

            int finish = 0;

            for (int i = 1; i <= x; i++) {
                int wynik = (1 + rand.nextInt(y));
                System.out.print("Wynik " + i + " rzutu kością: ");
                System.out.println(wynik);
                finish += wynik;
            }
            finish += z;
            System.out.println("Wynik rzutów to: " + finish);

        } else if (Character.isLetter(commend.charAt(0)) && commend.contains("+")) {
            String rcommend = commend.replaceAll("D", "");
            String[] parts = rcommend.split("\\+");
            String part2 = parts[0];
            String part3 = parts[1];
            int y = Integer.parseInt(part2);
            int z = Integer.parseInt(part3);
            Random rand2 = new Random();

            System.out.println("Wynik rzutu to: " + ((1 + rand2.nextInt(y)) + z));

        } else if (Character.isLetter(commend.charAt(0)) && commend.contains("-")) {
            String rcommend = commend.replaceAll("D", "");
            String[] parts = rcommend.split("\\-");
            String part2 = parts[0];
            String part3 = parts[1];
            int y = Integer.parseInt(part2);
            int z = Integer.parseInt(part3);
            Random rand2 = new Random();

            System.out.println("Wynik rzutu to: " + ((1 + rand2.nextInt(y)) + (-z)));

        } else if (Character.isLetter(commend.charAt(0)) && !commend.contains("-") && !commend.contains(("+"))) {
            String rcommend = commend.replaceAll("D", "");
            int y = Integer.parseInt(rcommend);
            Random rand3 = new Random();

            System.out.println("Wynik rzutu to: " + (1 + rand3.nextInt(y)));
            
        } else if (Character.isDigit(commend.charAt(0)) && !commend.contains("-") && !commend.contains(("+"))) {
            String[] parts = commend.split("D");
            String part1 = parts[0];
            String part2 = parts[1];
            int y = Integer.parseInt(part2);
            int x = Integer.parseInt(part1);
            Random rand3 = new Random();
            for (int i = 1; i <= x; i++)
                System.out.println("Wynik " + i + " rzutu kością to: " + (1 + rand3.nextInt(y)));
        }

    }

    static void pisanie(String str) throws InterruptedException {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
}
