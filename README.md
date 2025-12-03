<h1 align="center">🌷 ｡･ﾟﾟ･ UniBookmark Manager ･ﾟﾟ･｡ 🌷</h1>
<p align="center"><i>Your cozy console-based bookmark keeper ♡</i></p>

<pre align="center">
             _ _                 _                         _
 /\ /\ _ __ (_) |__   ___   ___ | | ___ __ ___   __ _ _ __| | __
/ / \ \ '_ \| | '_ \ / _ \ / _ \| |/ / '_ ` _ \ / _` | '__| |/ /
\ \_/ / | | | | |_) | (_) | (_) |   <| | | | | | (_| | |  |   <
 \___/|_| |_|_|_.__/ \___/ \___/|_|\_\_| |_| |_|\__,_|_|  |_|\_\
</pre>

<p align="center" style="color:#CE93D8;">
CS-2105<br>
Bacay, Kotnie Edrae L.<br>
Dadap, Amber Loveine R.<br>
Derez, Eume C.
</p>

<hr style="border:1px solid #F8BBD0;">

<h2 style="color:#F48FB1;">✿ Overview</h2>
<p style="color:#BA68C8;">
UniBookmark Manager is a simple console program that helps users organize their reading progress.  
You can <b>add, view, update, and delete bookmarks</b> right from the terminal. It's perfect for tracking mangas, novels, and textbooks in one place!
</p>

<p style="color:#BA68C8;">
This project demonstrates key <b>Object-Oriented Programming (OOP)</b> concepts such as <b>abstraction, inheritance, encapsulation</b>, and <b>polymorphism</b> through multiple book types.
</p>

<p style="color:#BA68C8;">
With UniBookmark, users can:<br/>
📚 Add bookmarks for <b>Manga</b>, <b>Novel</b>, or <b>Textbook</b><br>
🌸 View a neatly listed collection of bookmarked readings<br>
🖊️ Update reading progress or creator details<br>
🗑️ Delete bookmarks you no longer need
</p>

<h3 style="color:#F48FB1;">Bookmark Storage</h3>
<p style="color:#BA68C8;">🪄 All bookmarks are stored in memory using <b><code>ArrayList&lt;Book&gt;</code></b> while the program runs.</p>

<hr style="border:1px solid #F8BBD0;">

<h2 style="color:#F48FB1;">🐚 Project Structure</h2>
<pre style="background-color:#F3E5F5; padding:10px; border-radius:10px; color:#6A1B9A;">
📂 src/
└── 📂 UniBookMark/
    🍃 Main.java       — Main menu, user input, and program flow
    🌼 Book.java       — Abstract parent class for all bookmark types
    🌸 Manga.java      — Subclass with an added 'artist' field
    📖 Novel.java      — Subclass with an added 'author' field
    📘 Textbook.java   — Subclass with an added 'subject' field
</pre>

<h2 style="color:#F48FB1;">How to Run the Program</h2>
<p style="color:#BA68C8;">
1. Open your terminal inside the <code>src/</code> folder and compile the Java files:<br>
<code style="background-color:#F3E5F5; padding:2px 5px; border-radius:5px;">javac unibookmark/*.java</code><br><br>
2. Run the program:<br>
<code style="background-color:#F3E5F5; padding:2px 5px; border-radius:5px;">java unibookmark.Main</code>
</p>

<hr style="border:1px solid #F8BBD0;">

<h2 style="color:#F48FB1;">🌸 Features</h2>
<ul style="color:#BA68C8;">
<li>✨ <b>Add Bookmark</b> — Choose whether you're saving a Manga, Novel, or Textbook, then enter its details.</li>
<li>🌷 <b>View Bookmarks</b> — Lists all saved bookmarks and automatically displays the correct details for each book type.</li>
<li>🪶 <b>Update Bookmark</b> — Modify the title, page, chapter, or unique attributes (artist/author/subject).</li>
<li>💌 <b>Delete Bookmark</b> — Remove any bookmark permanently based on its number.</li>
</ul>

<h2 style="color:#F48FB1;">🫧 Object-Oriented Principles</h2>

<h3 style="color:#CE93D8;">💞 Encapsulation</h3>
<p style="color:#BA68C8;">Fields like <code>title</code>, <code>page</code>, <code>chapter</code>, <code>artist</code>, <code>author</code>, and <code>subject</code> are <b>private</b> and accessed through getters and setters.</p>

<h3 style="color:#CE93D8;">🌿 Abstraction</h3>
<p style="color:#BA68C8;"><code>Book</code> acts as a blueprint for all bookmarks, defining shared properties and the abstract <code>displayInfo()</code> method.</p>

<h3 style="color:#CE93D8;">🌼 Inheritance</h3>
<p style="color:#BA68C8;"><code>Manga</code>, <code>Novel</code>, and <code>Textbook</code> extend <code>Book</code>, inheriting and enhancing its structure.</p>

<h3 style="color:#CE93D8;">🌈 Polymorphism</h3>
<p style="color:#BA68C8;">Bookmarks are stored inside <code>ArrayList&lt;Book&gt;</code>. Calling <code>displayInfo()</code> automatically runs the correct version for the object type.</p>

<hr style="border:1px solid #F8BBD0;">

<h2 style="color:#F48FB1;">🌷 Sample Output</h2>

<div style="background-color:#F3E5F5; padding:10px; border-radius:10px; color:#6A1B9A;">

```txt
--- Bookmark Manager ---
1. Add Bookmark
2. View Bookmarks
3. Update Bookmark
4. Delete Bookmark
5. Exit

Choose an option: 1

Choose type of bookmark:
1. Manga
2. Novel
3. Textbook

Enter type: 2
Enter title: The Alchemist
Enter page number: 150
Enter chapter number: 18
Enter author: Paulo Coelho

Bookmark for "The Alchemist" is added!

--- Bookmark Manager ---
1. Add Bookmark
2. View Bookmarks
3. Update Bookmark
4. Delete Bookmark
5. Exit

Choose an option: 1

Choose type of bookmark:
1. Manga
2. Novel
3. Textbook

Enter type: 3
Enter title: Physics 101
Enter page number: 45
Enter chapter number: 7
Enter subject: Mechanics

Bookmark for "Physics 101" is added!

--- Bookmark Manager ---
1. Add Bookmark
2. View Bookmarks
3. Update Bookmark
4. Delete Bookmark
5. Exit

Choose an option: 2

Bookmark #1 Title: The Alchemist (Novel)
Page: 150, Chapter: 18
Author: Paulo Coelho

Bookmark #2 Title: Physics 101
Page: 45, Chapter: 7
Subject: Mechanics

```

<h2 style="color:#F48FB1;">🌼 Contributors</h2>

<table>
<tr>
<th>&nbsp;</th>
<th>Name</th>
</tr>
<tr>
<td><img src="static/Kotnie%20Edrae%20L.%20Bacay.jpg" width="100" height="100"></td>
<td><b>Bacay, Kotnie Edrae L.</b></td>
</tr>
<tr>
<td><img src="static/Amber%20Loveine%20R.%20Dadap.jpg" width="100" height="100"></td>
<td><b>Dadap, Amber Loveine R.</b></td>
</tr>
<tr>
<td><img src="static/Eume C. Derez.jpg" width="100" height="100"></td>
<td><b>Derez, Eume C.</b></td>
</tr>
</table>

<hr style="border:1px solid #F8BBD0;">

<h2 style="color:#F48FB1;">🍀 Acknowledgment</h2>
<p style="color:#BA68C8;">We would like to express our gratitude to our most coquette soft girly instructor <b>Ma’am Fatima Marie P. Agdon. </b>.We would like to extend our gratitude to our pets, Cotton Buds, Harris, Mingming, Mongmong, and Rado for their support throughout this project.</p>

