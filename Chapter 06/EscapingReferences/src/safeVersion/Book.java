package safeVersion;

import java.util.*;
import java.util.stream.*;

public class Book {

    private String title;
    private String author;
    private List<Chapter> chapters;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<Chapter>();
    }


    public List<Chapter> getChapters() {
        /* Java 8 version */
        return
            Collections.unmodifiableList(
                    chapters.stream().map(c -> new ChapterImpl(c)).collect(Collectors.toList())
            );

        /* Java 11 version */
        //return chapters.stream().map(c -> new ChapterImpl(c)).collect(Collectors.toUnmodifiableList());

        /* Java 17 version */
        //return chapters.stream().map(c -> new ChapterImpl(c)).toList();


    }

    public void addChapter(ChapterImpl chapter) {
        this.chapters.add(chapter);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
