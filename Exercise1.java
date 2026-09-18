// Exercise 1-Book information
// Create a Book class with the following attributes:
// bookId
// title
// author
// Create a parameterized constructor to initialize these values.
// Create a method displayInformation()to display the book details
// In main(), create two book Objects using the constructor and display their information.

class Book {
	private int bookId;
	private String title;
	private String author;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}

	public void displayInformation() {
		System.out.println("Book ID: " + bookId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println();
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		Book book1 = new Book(1, "The Alchemist", "Paulo Coelho");
		Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee");
		book1.displayInformation();
		book2.displayInformation();
	}
}
// thic=s code prints the following output:
// Book ID: 1
// Title: The Alchemist
// Author: Paulo Coelho
// Book ID: 2
// Title: To Kill a Mockingbird
// Author: Harper Lee
