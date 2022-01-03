import java.util.*;

public class Book {

    private String title;
    private String author;
    private List<Chapter> chapters;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.chapters = new ArrayList<>();
    }


    public List<Chapter> getChapters() {
        return chapters;
    }

    public void addChapter(Chapter chapter) {
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
