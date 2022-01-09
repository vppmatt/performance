import java.io.*;
import java.nio.file.*;
import java.util.*;

public class BookAnalysis {

    static Map<String,Integer> wordCount = new HashMap<>();

    private static void addWord (String word) {
        word.intern();
        if (wordCount.get(word) != null) {
            wordCount.put(word, wordCount.get(word) + 1);
        }
        else {
            wordCount.put(word,0);
        }
    }

    public static void main(String[] args) throws IOException {
        Path book = Paths.get("./resources/book.txt");

        Files.lines(book).forEach( line -> {
            String[] words = line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
            for(String word : words) {
                if (word.trim().length() > 0)
                addWord(word.trim());
            }
        });

        wordCount.forEach( (k,v) -> {
            if (v > 100) {
                System.out.println(k + ":" + v);
            }
        });

        System.out.println("Total number of unique words in the book : " + wordCount.size());

    }
}
