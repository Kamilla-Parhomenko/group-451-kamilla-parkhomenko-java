package clllllllllllllllasswork;

public class Book {

	String title;
	String author;
	int year;
	private boolean isAvailable;
	
	public Book(String title, String author, int year) {
		this.author = author;
		this.title = title;
		this.year = year;
		this.isAvailable = true;
	}
	
	void burrow() {
		if(isAvailable == true) {
			isAvailable = false;
		} else {
			System.err.println("! You cannot burrow this book.");
		}
	}
	
	void returnBook() {
		if(isAvailable == false) {
			isAvailable = true;
		}
	}
}
