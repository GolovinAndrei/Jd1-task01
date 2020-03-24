package by.stech.library.bean;

public class Book {

	private int iD;
	private String author;
	private String title;
	
	public Book() {
	}

	public Book(String author, String title, int iD) {
		this.iD = iD;
		this.author = author;
		this.title = title;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
