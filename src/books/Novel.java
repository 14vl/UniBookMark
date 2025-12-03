package books;

public class Novel extends Book {

    private String author; // unique to novels

    public Novel(String title, int page, int chapter, String author) {
        super(title, page, chapter);
        this.author = author;
    }

    public String getAuthor(){ return author; }
    public void setAuthor(String author){ this.author = author; }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle() + " (Novel)");
        System.out.println("Chapter: " + getChapter() + ", Page: " + getPage());
        System.out.println("Author: " + author);
    }
}
