package safeVersion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book makingUpNumbers = new Book("Making up Numbers: A History of Invention in Mathematics",
                "Ekkehard Kopp");
        makingUpNumbers.addChapter(new ChapterImpl(1, "Arithmetic in Antiquity" ,13));
        makingUpNumbers.addChapter(new ChapterImpl(2, "Writing and Solving Equations" ,45));
        makingUpNumbers.addChapter(new ChapterImpl(3, "Construction and Calculation" ,67));
        makingUpNumbers.addChapter(new ChapterImpl(4, "Coordinates and Complex Numbers" ,85));

        List<Chapter> chapters = makingUpNumbers.getChapters();

        /*
                Although the following line of code would compile, it will give a runtime exception
                because chapters is an unmodifyable list.
         */
        //chapters.remove(0);

        Chapter c = makingUpNumbers.getChapters().get(0);

        /*
                The following line of code won't compile as the Chapter interface doens't have the setter
                 methods.
         */
        //c.setName("This is the wrong title");

        /*
                The following lines of code attempt to cheat  and allow the data to be changed. Although these
                  will without  an exception, because we have created a copy of the chapter object, the original
                  is left untouched - we have removed the escaping reference.
         */
        ChapterImpl c1 = (ChapterImpl)c;
        c1.setName("This is the wrong title");

        for (Chapter chapter : chapters) {
            System.out.println(chapter.getName());
        }

    }
}

