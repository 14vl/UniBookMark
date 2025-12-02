package UniBookMark;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        ArrayList<Book> bookmarks = new ArrayList<>();                                          // ArrayList to store bookmarks
        Scanner cin = new Scanner(System.in);                                                   // Scanner for user input

        while(true){
            System.out.println("\n--- Bookmark Manager ---");
            System.out.println("1. Add Bookmark");
            System.out.println("2. View Bookmarks");
            System.out.println("3. Update Bookmark");
            System.out.println("4. Delete Bookmark");
            System.out.println("5. Exit\n");
            System.out.print("Choose an option: ");
            int choice = cin.nextInt();
            System.out.println();

            switch(choice){

                case 1:                                                                             //Add Bookmark
                    System.out.println("Choose type of bookmark:");
                    System.out.println("1. Manga");
                    System.out.println("2. Novel");
                    System.out.println("3. Textbook\n");
                    System.out.print("Enter type: ");
                    int type = cin.nextInt();
                    cin.nextLine();

                    System.out.print("Enter title: ");
                    String title = cin.nextLine();

                    System.out.print("Enter page number: ");
                    int page = cin.nextInt();

                    System.out.print("Enter chapter number: ");
                    int chapter = cin.nextInt();
                    cin.nextLine();

                    Book book;                                                                      // Create book object based on type

                    if(type == 1){
                        System.out.print("Enter artist: ");
                        String artist = cin.nextLine();
                        book = new Manga(title, page, chapter, artist);                             // Manga subclass
                    }
                    else if(type == 2){
                        System.out.print("Enter author: ");
                        String author = cin.nextLine();
                        book = new Novel(title, page, chapter, author);                             // Novel subclass
                    }
                    else if(type == 3){
                        System.out.print("Enter subject: ");
                        String subject = cin.nextLine();
                        book = new Textbook(title, page, chapter, subject);                         // Textbook subclass
                    }
                    else{
                        System.out.println("Invalid type chosen!");
                        break;
                    }

                    bookmarks.add(book);                                                            // Adds values in Book to be printed
                    System.out.println("\nBookmark for \"" + title +"\" is added! ");
                    break;

                case 2:                                                                             //View Bookmarks
                    if(bookmarks.isEmpty()){
                        System.out.println("It seems like you haven't added any bookmark yet!");
                    }
                    else{
                        for(int i = 0; i < bookmarks.size(); i++){
                            System.out.print("\nBookmark #" + (i +1) + " "); 
                            bookmarks.get(i).displayInfo();                                         // Calls the correct displayInfo() based on object type
                        }
                    }
                    break;

                case 3:                                                                             //Update Bookmark
                    if(bookmarks.isEmpty()){
                        System.out.println("You made no bookmarks, nothing to update. To make one press 1.");
                        break;
                    }

                    System.out.print("Enter a bookmark to update: ");
                    int updIn = cin.nextInt() - 1;
                    cin.nextLine();

                    if(updIn < 0 || updIn >= bookmarks.size()){
                        System.out.println("That bookmark doesn't exist!");
                        break;
                    }

                    Book toUpdate = bookmarks.get(updIn);

                    System.out.print("Enter new title (leave blank to keep current): ");
                    String newTitle = cin.nextLine();
                    if (!newTitle.isEmpty()) toUpdate.setTitle(newTitle);

                    System.out.print("Enter new page number (0 to keep current): ");
                    int newPage = cin.nextInt();
                    if (newPage != 0) toUpdate.setPage(newPage);

                    System.out.print("Enter new chapter number (0 to keep current): ");
                    int newChapter = cin.nextInt();
                    cin.nextLine();
                    if (newChapter != 0) toUpdate.setChapter(newChapter);

                    if(toUpdate instanceof Manga){                                                  // Checks if Manga to update artist
                        System.out.print("Enter new artist (leave blank to keep current): ");
                        String newArtist = cin.nextLine();
                        if(!newArtist.isEmpty())
                            ((Manga) toUpdate).setArtist(newArtist);
                    }
                    else if(toUpdate instanceof Novel){                                             // Checks if Novel to update author
                        System.out.print("Enter new author (leave blank to keep current): ");
                        String newAuthor = cin.nextLine();
                        if(!newAuthor.isEmpty())
                            ((Novel) toUpdate).setAuthor(newAuthor);
                    }
                    else if(toUpdate instanceof Textbook){                                          // Checks if Textbook to update subject
                        System.out.print("Enter new subject (leave blank to keep current): ");
                        String newSubject = cin.nextLine();
                        if(!newSubject.isEmpty())
                            ((Textbook) toUpdate).setSubject(newSubject);
                    }

                    System.out.println("\nBookmark updated!");
                    break;

                case 4:                                                                             //Delete Bookmark
                    if (bookmarks.isEmpty()) {
                        System.out.println("No bookmarks to delete.");
                        break;
                    }
                    System.out.print("Enter bookmark number to delete: ");
                    int delIndex = cin.nextInt() - 1;
                    cin.nextLine();
                    if (delIndex < 0 || delIndex >= bookmarks.size()) {
                        System.out.println("Invalid index.");
                        break;
                    }
                    Book removed = bookmarks.remove(delIndex);
                    System.out.println("Bookmark \"" + removed.getTitle() + "\" deleted!");
                    break;

                case 5:                                                                             //Exit
                    System.out.println("Thank you for using UniBookMark!");
                    System.exit(10);
            }
        }
    }
}
