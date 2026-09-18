// reate a Book class with:

// bookId
// title
// author
// price

// Create overloaded constructors:

// Constructor with only bookId
// Constructor with bookId and title
// Constructor with bookId, title, author, and price

// Create objects using each constructor and display their information.

public class Book {
    int bookId;
    String title;
    String author;
    double price;

    Book() {
        this(0, "", "", 0.0);
    }

    Book(int bookId) {
        this(bookId, "", "", 0.0);
    }

    Book(int bookId, String title) {
        this(bookId, title, "", 0.0);
    }

    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book(1);
        Book book3 = new Book(2, "Java Programming");
        Book book4 = new Book(3, "Python Programming", "John Doe", 29.99);

        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }
}
