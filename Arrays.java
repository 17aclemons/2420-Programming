/*
 * Andrew Clemons
 * Programming 4 not using shape hierarchy 
 * Spring 2019
 */
public class Arrays {
	
	//4.22
	public <AnyType> void copy(AnyType[] original, AnyType[] copy) {
		for(int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}
	}
	
	//4.23
	public static <AnyType extends Comparable> AnyType min(AnyType one, AnyType two) {
		if(one.compareTo(two) > 0) {
			return two; 
		}else {
			return one; 
		}
	}
	
	public static <AnyType extends Comparable> AnyType max(AnyType one, AnyType two) {
		if(one.compareTo(two) > 0) {
			return one;
		}else {
			return two; 
		}
	}
	
	//4.24
	public static <AnyType extends Comparable> AnyType minArray(AnyType[] array) {
		int smallest = 0;
		for(int i = 1; i < array.length; i++) {
			if(array[i].compareTo(array[smallest]) < 0) {
				smallest = i; 
			}
		}
		return array[smallest];
	}
	
	//main
	
	public static void main(String[] args) {
		
		System.out.println(min(1,2));
		System.out.println(max(1,2));
		
		String[] test = new String[]{"Charles","Jake","Amy","Terry"};
		System.out.println(minArray(test));
	}
}
