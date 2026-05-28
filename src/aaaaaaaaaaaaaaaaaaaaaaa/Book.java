package aaaaaaaaaaaaaaaaaaaaaaa;

public class Book {

	private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book was given out");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book has been returned");
    }

    public String getAuthor() { 
    	return author; 
    }
    public String getTitle() { 
    	return title; 
    }
}
