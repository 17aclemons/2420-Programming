/*
 * Andrew Clemons
 * Programming 4 not using shape hierarchy 
 * Spring 2019
 */
public class LibraryBook extends Book {
	
	private String dueDate;
	private String currentHolder;
	
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getCurrentHolder() {
		return currentHolder;
	}

	public void setCurrentHolder(String currentHolder) {
		this.currentHolder = currentHolder;
	}


	LibraryBook(String author, String title, String ISBN, String dueDate,String currentHolder) {
		super(author,title,ISBN);
		this.dueDate = dueDate;
		this.currentHolder = currentHolder; 
	}
}
