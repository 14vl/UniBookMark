package UniBookMark;

public class Textbook extends Book {
    private String subject;

    public Textbook(String title, int page, int chapter, String subject){
        super(title, page, chapter);
        this.subject = subject;
    }

    // Accessor and Mutator
    public String getSubject(){ return subject; }
    public void setSubject(String subject){ this.subject = subject; }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle() + "\nPage: " + getPage() + ", Chapter: " + getChapter());
        System.out.println("Subject: " + subject);
    }
}
