package safeVersion;

public class ChapterImpl implements Chapter {

    private int id;
    private String name;
    private int startPage;

    public ChapterImpl(int id, String name, int startPage) {
        this.id = id;
        this.name = name;
        this.startPage = startPage;
    }

    public ChapterImpl(Chapter chapter) {
        this(chapter.getId(), chapter.getName(), chapter.getStartPage());
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

}
