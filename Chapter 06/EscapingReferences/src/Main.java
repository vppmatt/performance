import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book makingUpNumbers = new Book("Making up Numbers: A History of Invention in Mathematics",
                "Ekkehard Kopp");
        makingUpNumbers.addChapter(new Chapter(1, "Arithmetic in Antiquity" ,13));
        makingUpNumbers.addChapter(new Chapter(2, "Writing and Solving Equations" ,45));
        makingUpNumbers.addChapter(new Chapter(3, "Construction and Calculation" ,67));
        makingUpNumbers.addChapter(new Chapter(4, "Coordinates and Complex Numbers" ,85));

        List<Chapter> chapters = makingUpNumbers.getChapters();
        for (Chapter c : chapters) {
            System.out.println(c.getName());
        }

    }
}

