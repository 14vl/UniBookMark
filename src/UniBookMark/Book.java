package UniBookMark;

public abstract class Book {
    private String title;
    private int page;
    private int chapter;

    public Book(String title, int page, int chapter){
        this.title = title;
        this.page = page;
        this.chapter = chapter;
    }

    public String getTitle (){ return title;}
    public void setTitle (String title){this.title = title;}

    public int getPage(){ return page;}
    public void setPage(int page){this.page = page;}

    public int getChapter(){ return chapter;}
    public void setChapter(int chapter){this.chapter = chapter;}

    public abstract void displayInfo();

    // Existing inner class
    static class DetailedBookmark extends Book{
        private String note;

        public DetailedBookmark(String title, int page, int chapter,String note){
            super(title, page, chapter);
            this.note = note;
        }
        public String getNote(){ return note;}
        public void setNote(String note){this.note = note;}

        public void displayInfo() {
            System.out.println("Title: " + getTitle() + ", Page: " + getPage() + ", Chapter: " + getChapter());     //Provides a specific implementation of displayInfo().
            System.out.println("Note: " + note);
        }
    }

    // Protected constructor for top-level subclasses
    protected Book() {
        this.title = "";
        this.page = 0;
        this.chapter = 0;
    }
}
