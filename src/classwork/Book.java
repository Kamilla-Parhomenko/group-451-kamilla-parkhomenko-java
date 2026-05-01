package classwork;

public class Book {

	String title;
	String author;
	int pages;
	
	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		Book.totalbooks+=1;
	}
	
	static int totalbooks = 0;
	
	
}
