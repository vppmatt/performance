public class Chapter {

    private int id;
    private String name;
    private int startPage;

    public Chapter(int id, String name, int startPage) {
        this.id = id;
        this.name = name;
        this.startPage = startPage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

}
