import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*Andrew Clemons
 * CS 2420
 * Chapter 2 Programming
 * Spring 2019
 * problem 2.34
 */
public class Problem2 {

	public static void main(String[] args) throws Exception {
		oldestPerson("People.txt");
		oldestPeople("People.txt");
	}

	//2.34 part a
	public static String oldestPerson(String fileName) throws Exception {

		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> age = new ArrayList<Integer>(); 
		
		//puts names and ages in respectable ArrayList
		while(scanner.hasNextLine()) {
			String i = scanner.next();
			name.add(i);
			int j = scanner.nextInt();
			age.add(j);
		}

		int oldest = 0;
		int position = 0; 
		
		//finds the oldest age and keeps track of position in arraylist
		for(int j = 0; j < age.size(); j++ ) {
			if(oldest < age.get(j)) {
				oldest = age.get(j);
				position = j; 
			}
		}
		//prints oldest person and age
		System.out.println(name.get(position)+ " " + age.get(position));
		return name.get(position); 
	}

	public static ArrayList<String> oldestPeople(String fileName) throws FileNotFoundException {

		File file = new File(fileName);
		Scanner scanner = new Scanner(file);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> age = new ArrayList<Integer>(); 
		ArrayList<String> oldestPeople = new ArrayList<String>();
		
		//puts names and ages in respectable ArrayLists
		while(scanner.hasNextLine()) {
			String i = scanner.next();
			name.add(i);
			int j = scanner.nextInt();
			age.add(j);
		}

		int oldest = 0;
		int position = 0; 
		//finds the oldest age and keeps track of their position in the arrayList
		for(int j = 0; j < age.size(); j++ ) {
			if(oldest < age.get(j)) {
				oldest = age.get(j);
				position = j; 
			}
		}
		//fills the oldestPerson array with the oldest people
		for(int j = 0; j < age.size(); j++) {
			if(oldest == age.get(j)) {
				oldestPeople.add(name.get(j));
			}
		}
		//prints all the oldest people
		for(int j = 0; j < oldestPeople.size(); j++) {
			System.out.println(oldestPeople.get(j));
		}
		return oldestPeople; 
	}
}
