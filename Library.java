/*
 * Andrew Clemons
 * Programming 4 not using shape hierarchy 
 * Spring 2019
 */
import java.util.ArrayList;

public class Library {

	ArrayList<LibraryBook> library;

	public void addBook(LibraryBook book) {
		library.add(book);
	}

	public void checkoutBook(String ISBN, String newHolder, String dueDate) {
		for(int i = 0; i < library.size(); i++) {
			if(library.get(i).getISBN().compareTo(ISBN) == 0) {
				library.get(i).setCurrentHolder(newHolder);
				library.get(i).setDueDate(dueDate);
			}
		}
	}

	public String currentHolder(String ISBN) {
		for(int i = 0; i < library.size(); i++) {
			if(library.get(i).getISBN().compareTo(ISBN) == 0) {
				return library.get(i).getCurrentHolder();
			}
		}
		return null;	
	}
}
