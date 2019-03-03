package pl.dpawlicki.workshops_1.guess_number_ver2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessNumberV2App {

    public static void main(String[] args) throws InterruptedException {

        pisanie("Witaj w kolejnej grze z serii: ");
        literowanie("GUESS NUMBER!");
        System.out.println();
        pisanie("Dzisiejsza wersja gry będzie polagała na ogadnięciu liczby, ale przeze mnie! \n");
        TimeUnit.MILLISECONDS.sleep(800);
        pisanie("Przedział liczbowy ustalmy sobie od 0 do 1000. \n");
        pisanie("Jeżeli liczba jest większa odpowiedz ' more ', jeżeli mniejsza to ' less ', a jak zgadnę to ' trafiłeś '. Okej? \n");
        System.out.println();
        TimeUnit.MILLISECONDS.sleep(800);
        pisanie("Skoro tak to podaj mi liczbę do odgadnięcia: ");
        Scanner scan = new Scanner(System.in);

        int noToGuess = scan.nextInt();

        while (true) {
            if (noToGuess > 1000 || noToGuess < 0) {
                System.err.println("Miało być od 0 do 1000. \n ");
                pisanie("Podaj liczbę od 0 do 1000: ");
                noToGuess = scan.nextInt();
                System.out.println();
            } else {
                pisanie("Dobrze, a więc Twoja liczba to: " + noToGuess + "\n");
                pisanie("W tym momencie zapominam jaka to liczba, a Ty mnie na nią nakieruj. \n");
                break;
            }

        }
        Scanner scan1 = new Scanner(System.in);
        String answer = "";
        int min = 0;
        int max = 1000;
        int noOfAnswer = 1;
        while (true) {
            int guess = ((max - min) / 2) + min;
            pisanie("Typuję liczbę: " + guess + "\n");
            pisanie("I jak mi poszło?: ");
            answer = scan1.nextLine();
            System.out.println();
            if (answer.equalsIgnoreCase("more")) {
                min = guess;
                pisanie("No to zgadujemy dalej... \n");
                noOfAnswer++;
                TimeUnit.MILLISECONDS.sleep(400);
            } else if (answer.equalsIgnoreCase("less")) {
                max = guess;
                pisanie("No to zgadujemy dalej... \n");
                noOfAnswer++;
                TimeUnit.MILLISECONDS.sleep(400);
            } else if (answer.equalsIgnoreCase("trafiłeś") && noToGuess == guess) {
                pisanie("A nie mówiłem, że mi się uda? Udało mi się to za " + noOfAnswer + " razem.");
            } else if (noToGuess == guess) {
                pisanie("Miałeś napisać \" trafiłeś \", a nie \" " + answer + " \". \n");
                pisanie("Tak czy owak, a nie mówiłem, że mi się uda? Udało mi się to za " + noOfAnswer + " razem.");
                break;
            }
        }

    }

    static void literowanie(String str) throws InterruptedException {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            TimeUnit.MILLISECONDS.sleep(350);
        }
    }

    static void pisanie(String str) throws InterruptedException {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            TimeUnit.MILLISECONDS.sleep(50);
        }
    }
}
