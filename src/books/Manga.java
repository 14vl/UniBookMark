package books;

public class Manga extends Book {

    private String artist; // unique to manga

    public Manga(String title, int page, int chapter, String artist) {
        super(title, page, chapter);
        this.artist = artist;
    }

    public String getArtist(){ return artist; }
    public void setArtist(String artist){ this.artist = artist; }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle() + " (Manga)");
        System.out.println("Page: " + getPage() + ", Chapter: " + getChapter());
        System.out.println("Artist: " + artist);
    }
}
