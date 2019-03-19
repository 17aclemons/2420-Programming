/*
 * Andrew Clemons
 * Chapter 4 programming not using shape hierarchy
 * Spring 2019
 */

public class Person implements Comparable{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	public static Person findMaxPerson(Person [] people) {
		int maxPerson = 0; 
		
		for(int i = 1; i < people.length; i++) {
			if(people[i].compareTo(people[maxPerson]) > 0) {
				maxPerson = i; 
			}
		}return people[maxPerson];
	}

	private String getName() {
		return name;
	}

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Person one = new Person("Jake");
		Person two = new Person("Terry"); 
		
		Person[] array = {one,two}; 
		
		System.out.println(findMaxPerson(array).getName());
	}
}
