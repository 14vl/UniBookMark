# <p style= "text-align: center;"> 🌷 ｡･ﾟﾟ･ UniBookmark Manager ･ﾟﾟ･｡ 🌷</p>
 <p style= "text-align: center;"> Your cozy console-based bookmark keeper ♡</p>
<p style= "text-align: center;"> CS-2105 </p>
  <p style= "text-align: center;"> Bacay, Kotnie Edrae L.</p>
  <p style= "text-align: center;">Dadap, Amber Loveine R.</p>
  <p style= "text-align: center;">Derez, Eume C. </p>

_________________

### ✿˚｡⋆ Overview
 UniBookmark Manager is a simple console program that helps users organize their book bookmarks. You can add, view, update, and delete bookmarks directly from the terminal, making it easy to remember where you last stopped reading!

This project showcases **Object-Oriented Programming (OOP)** in Java, using concepts like **encapsulation, inheritance, polymorphism**, and **abstraction** to build a neat and expandable program.

With UniBookmark, users can:
 📖 Add a new bookmark with details and notes
 🌸 View all saved bookmarks in a list
 🖊️ Edit existing bookmarks easily
 🗑️ Delete bookmarks that are no longer needed

#### Bookmark Storage
 🪄 All bookmarks are stored temporarily in memory using an ArrayList<Book> while the program is running.

#### 🐚˚｡⋆ Project Structure
 📂 src/
 └── 📂 Unibookmark/
     🍃 **Main.java** — Contains the main menu and handles user input and program flow.
     🌼 **Book.java** — Abstract class representing a book, with a subclass for detailed bookmarks that include personal notes.

 _____

### How to Run the Program
-Open your terminal inside the `src/` folder and compile the Java files:


`javac unibookmark/*.java`

-Then run the program:


`java unibookmark.Main`


### 🌸˚｡⋆Features
 ✨ **Add Bookmark** — Create a new bookmark by entering its title, page, chapter, and personal note.
 🌷 **View Bookmarks** — Display all saved bookmarks in order.
 🪶 **Update Bookmark** — Change the title, page number, or note of any bookmark.
 💌 **Delete Bookmark** — Remove a bookmark permanently.

_________________

### 🫧˚｡⋆Object-Oriented Principles
#### 💞 Encapsulation
 Important bookmark details like title, page number, and notes are kept private and accessed through methods. This keeps the data organized and protected.

#### 🌿 Abstraction
 The `Book` class serves as a blueprint for all bookmarks. The subclass `DetailedBookmark` provides the full details and defines how each bookmark is displayed through `displayInfo().`

#### 🌼 Inheritance
`DetailedBookmark` inherits from `Book`, showing how subclasses can expand and reuse the structure of a parent class.

#### 🌈 Polymorphism
 By using an `ArrayList<Book>`, the program can handle different bookmark objects through one shared type. When `displayInfo()` is called, it automatically runs the correct version for each bookmark type.

 _________________

### 🌷˚｡⋆ Sample Output
```
--- Bookmark Manager ---
1. Add Bookmark
2. View Bookmarks
3. Update Bookmark
4. Delete Bookmark
5. Exit
Choose an option: 1

Enter title: The Little Prince
Enter page number: 42
Enter chapter Number: 7
Enter note: The fox’s secret ♡

Bookmark for "The Little Prince" added successfully!

--- Bookmark Manager ---
1. Add Bookmark
2. View Bookmarks
3. Update Bookmark
4. Delete Bookmark
5. Exit
Choose an option: 2

Bookmark #1
Title: The Little Prince
Page: 42
Chapter: 7
Note: The fox’s secret ♡ 
```

_________________

#### 🌼˚｡⋆ Contributors

|  | Second Header 
 ------------ | ------------- 
![alt text](/src/static/Kotnie%20Edrae%20L.%20Bacay.jpg){width=100px height=100px} | Bacay, Kotnie Edrae L.
![alt text](/src/static/Amber%20Loveine%20R.%20Dadap.jpg){width=100px height=100px}| Dadap, Amber Loveine R.
![alt text](/src/static/Eume%20C.%20Derez.jpg){width=100px height=100px}| Derez, Eume C.

_________________

#### 🍀˚₊· Acknowledgment
 We would like to express our gratitude to our most coquette soft girly instructor Ma’am Fatima Marie P. Agdon. We would like to extend our gratitude to our pets, Cotton Buds, Harris, Mingming, Mongmong, and Rado for their support throughout this project.  