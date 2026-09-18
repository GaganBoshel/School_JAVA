// uestion 3. Create a Book class with:

// bookId
// title
// author
// price

// Create:

// A parameterized constructor
// A copy constructor

// Create one book object and create another book object by copying the first object.

// Display both books.

public class Book2 {
	public static void main(String[] args) {
		Book firstBook = new Book(1, "The Alchemist", "Paulo Coelho", 299.99);
		Book secondBook = new Book(firstBook);

		System.out.println(firstBook);
		System.out.println(secondBook);
	}
}

class Book {
	private int bookId;
	private String title;
	private String author;
	private double price;

	public Book(int bookId, String title, String author, double price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book(Book other) {
		this(other.bookId, other.title, other.author, other.price);
	}

	@Override
	public String toString() {
		return "Book ID: " + bookId + ", Title: " + title
				+ ", Author: " + author + ", Price: " + price;
	}
}
