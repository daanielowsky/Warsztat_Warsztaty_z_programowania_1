package pl.dpawlicki.workshops_1.search_for_most_popular_words;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PopularWords {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("/Users/daniel/Desktop/warsztaty_1/Warsztat_Warsztaty_z_programowania_1/src/pl/dpawlicki/workshops_1/search_for_most_popular_words/popular_words.txt");

        Connection connect = Jsoup.connect("http://www.onet.pl/");
        try {
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {
                printWriter.println(elem.text());
                System.out.println(elem.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.close();

        File file = new File("/Users/daniel/Desktop/warsztaty_1/Warsztat_Warsztaty_z_programowania_1/src/pl/dpawlicki/workshops_1/search_for_most_popular_words/popular_words.txt");
        Scanner scan = new Scanner(file);

        String[] excludedWords = {"oraz", "ponieważ", "okoń"};
        PrintWriter printWriter1 = new PrintWriter("/Users/daniel/Desktop/warsztaty_1/Warsztat_Warsztaty_z_programowania_1/src/pl/dpawlicki/workshops_1/search_for_most_popular_words/filtred_words.txt");
        String word;
        while (scan.hasNext()) {
            word = scan.next();
            if (word.length() > 3 && word != excludedWords[0] && word != excludedWords[1] && word != excludedWords[2]) {
                printWriter1.println(word);
            }
        }

        printWriter1.close();

    }
}
