
/*
 * Andrew Clemons
 * CS 2420
 * Chapter 2 Programming
 * Spring 2019
 * problem 2.19
 */
public class Problem1 {

	public static void main(String [] args) {
	//test 2.19 method
		
		int [] arr = {1,2,3,1,1,1,1,1,1,1};
		hasDuplicates(arr);
		//returns true
		
		int [] arr1 = {1,2,3,4,5,6,7,8};
		hasDuplicates(arr1);
		//returns false

	}

	//2.19
	public static boolean hasDuplicates (int [] arr) {

		int duplicate = 0; 

		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					duplicate++; 
				}
			}
		}
		if(duplicate > 1) {
			System.out.println("True");
			return true;
			

		}else {
			System.out.println("False");
			return false; 
		}
	}
}
