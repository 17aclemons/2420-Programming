/*
 * Andrew Clemons
 * programming 4 not using the shape hierarchy
 * Spring 2019
 */
public class ComparableMemoryCell {
	//4.29
	public static <MemoryCell extends Comparable> MemoryCell compare(MemoryCell one, MemoryCell two) {
		if(one.compareTo(two) == 0) {
			System.out.println("They are the same");
			return one;
		}else {
			System.out.println("They are different");
			return null;
		}
	}
}
