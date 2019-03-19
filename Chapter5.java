/*
 * Andrew Clemons
 * Spring 2019
 * Chapter 5 Programming - In Practice
 */
public class Chapter5 {
	//5.30
	//Linear run time
	public static boolean exists(int [] stuff, int integer) {
		for(int i = 0; i < stuff.length; i++) {
			if(integer == stuff[i]) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}

	//5.31
	//Linear run time
	public static boolean prime(int n) {
		int count = 0; 
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count > 1) {
			return false;
		}else {
			return true;
		}
	}

	//5.33
	//Quadratic runtime 
	public static boolean majority(int[] array) {
		boolean isThere = true;
		for(int i = 0; i < array.length; i++) {
			int count = 0; 
			for(int j = 1; j < array.length; j++) {
				if(array[i] == array[j]) {
					count++; 
				}
			}
			if(count > (array.length/2)) {
				isThere = true;
			}else {
				isThere = false;
			}
		}
		return isThere;
	}
	
	

	public static void main(String[] args) {
		// test 5.30
		//int[] stuff = {1,2,3,4,5};
		//System.out.println(exists(stuff,5));

		//5.31
		//System.out.println(prime(10));
		//System.out.println(prime(821));

		//5.33
		int[] numbers = {1,1,1,1,1,1,1,1,1,1};
		int[] numbers2 = {2,3,4,5,6,4,3,4};
		System.out.println(majority(numbers));
		System.out.println(majority(numbers2));
	}
}
