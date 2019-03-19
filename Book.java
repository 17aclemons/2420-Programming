/*
 * Andrew Clemons
 * Programming 4 not using shape hierarchy 
 * Spring 2019
 */
public class Book extends Library {

	private String author;
	private String title;
	private String ISBN;
	
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	Book(String author, String title, String ISBN){
		this.author = author;
		this.title = title; 
		this.ISBN = ISBN; 
	}
}
