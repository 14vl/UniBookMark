package UniBookMark;
import java.util.ArrayList;
import java.util.Scanner;
  
public class Main{
    public static void main(String[] args){

        ArrayList<Book> bookmarks = new ArrayList<>();
        Scanner cin = new Scanner(System.in);

        while(true){
            System.out.println("\n--- Bookmark Manager ---");
            System.out.println("1. Add Bookmark");
            System.out.println("2. View Bookmarks");
            System.out.println("3. Update Bookmark");
            System.out.println("4. Delete Bookmark");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = cin.nextInt();
            System.out.println();

        switch(choice){
            case 1: 
            System.out.print("Enter title: ");
            cin.nextLine();
            String title = cin.nextLine();

            System.out.print("Enter page number: ");
            int page = cin.nextInt();

            System.out.print("Enter chapter number: ");
            int chapter = cin.nextInt();

            System.out.print("Enter note: ");
            cin.nextLine();
            String note = cin.nextLine();
           
            Book book = new Book.DetailedBookmark(title, page, chapter, note);                             //Extends Book and is treated as a Book object.
            bookmarks.add(book);                                                                           //Adds values in Book to be printed.
            System.out.println("\nBookmark for \"" + title +"\" is added! ");
            break;

            case 2:
            if(bookmarks.isEmpty()){
                System.out.println("It seems like you havent added any bookmark yet!");
            } else{
                for( int i = 0; i < bookmarks.size(); i++){
                    System.out.print("\nBookmark #" + (i +1) + "\n");
                    bookmarks.get(i).displayInfo();                                                       //Calls the correct displayInfo() based on object type.
                }
            }
            break;

            case 3:
                if(bookmarks.isEmpty()){
                    System.out.println("You made no bookmarks, nothing to update. To make one press 1.");
                }

                System.out.print("Enter a bookmark to update: ");
                int updIn = cin.nextInt() - 1;
                cin.nextLine();
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

                    if (toUpdate instanceof Book.DetailedBookmark) {                                      //Checks if DetailedBookmark to update note.
                        System.out.print("Enter new note (leave blank to keep current): ");
                        String newNote = cin.nextLine();
                        System.out.println("\nBookmark for \"" +newTitle+ "\" is updated!");
                        if (!newNote.isEmpty())
                            ((Book.DetailedBookmark) toUpdate).setNote(newNote);
                    }


                if(updIn < 0 || updIn >= bookmarks.size()){
                    System.out.println("That bookmark doesnt exist!");
                    break;
                }
            break;

            case 4:
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

            case 5:
            System.out.println("Thank you for using UniBookMark!");
            System.exit(10);
            }
        }
    }

}
