package pl.dpawlicki.workshops_1.cube;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Dice {

    public static void main(String[] args) throws InterruptedException {

        pisanie("Widzę, że potrzebujesz koski do gry. \nSpokojnie, pomogę Ci, ale na początek potrzebuję kilku informacji. \n");
        Scanner scan = new Scanner(System.in);
        String kindOfCube = "";
        int howManyTimes = 0;
        int modyficator = 0;
        pisanie("Zacznijmy od tego jaką kostką chcesz grać. \nDo wyboru masz: D3, D4, D6, D8, D10, D12, D20, D100. \n");
        TimeUnit.MILLISECONDS.sleep(200);
        pisanie("Twój wybór to: ");
        kindOfCube = scan.nextLine();
        System.out.println();
        pisanie("Teraz potrzebuję informacji na temat ilości rzutów. \nTo ile ma ich być?: ");
        howManyTimes = scan.nextInt();
        System.out.println();
        pisanie("No i ostatnie, jaki chciałbyś mieć modyfikator? ( zero jest domyślne ): ");
        modyficator = scan.nextInt();
        System.out.println();
        int number = 0;
        Random rand = new Random();
        int randNumber = 0;
        int sum = 0;

        for (int i = 0; i < howManyTimes; i++) {
            if (kindOfCube.equalsIgnoreCase("d3")) {
                number = (randNumber = 1 + rand.nextInt(3)) + modyficator;
                pisanie("Wynik rzutu to: " + number + "\n");
                sum += number;
            } else if (kindOfCube.equalsIgnoreCase("D4")) {
                number = (randNumber = 1 + rand.nextInt(4)) + modyficator;
                pisanie("Wynik rzutu to: " + number + "\n");
                sum += number;
            } else if (kindOfCube.equalsIgnoreCase("D6")) {
                number = (randNumber = 1 + rand.nextInt(6)) + modyficator;
                pisanie("Wynik rzutu to: " + number + "\n");
                sum += number;
            } else if (kindOfCube.equalsIgnoreCase("D8")) {
                number = (randNumber = 1 + rand.nextInt(8)) + modyficator;
                pisanie("Wynik rzutu to: " + number + "\n");
                sum += number;
            } else if (kindOfCube.equalsIgnoreCase("D10")) {
                number = (randNumber = 1 + rand.nextInt(10)) + modyficator;
                pisanie("Wynik rzutu to: " + number + "\n");
                sum += number;
            } else if (kindOfCube.equalsIgnoreCase("D12")) {
                number = (randNumber = 1 + rand.nextInt(12)) + modyficator;
                pisanie("Wynik rzutu to: " + number + "\n");
                sum += number;
            } else if (kindOfCube.equalsIgnoreCase("D20")) {
                number = (randNumber = 1 + rand.nextInt(20)) + modyficator;
                pisanie("Wynik rzutu to: " + number + "\n");
                sum += number;
            } else if (kindOfCube.equalsIgnoreCase("D100")) {
                number = (randNumber = 1 + rand.nextInt(100)) + modyficator;
                pisanie("Wynik rzutu to: " + number + "\n");
                sum += number;
            }
        }
        pisanie("Wynik rzutu kośćmi to: " + sum + "\n");

    }

    static void pisanie(String str) throws InterruptedException {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
}
