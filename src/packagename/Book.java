package packagename;

public class Book {

	String title;
	String author;
	int pages;
	
	public void displayinfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(pages);
	}
	
	public Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
}
