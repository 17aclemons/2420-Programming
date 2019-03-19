import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter7 {

	//7.21
	public static int A(int m, int n) {
		if(m == 0) {
			return n+1;
		}else if(m > 0 && n == 0) {
			A(m-1,1);
		}else if(m > 0 && n > 0) {
			A(m-1,A(m,n-1));
		}
		// if m and n are both less than 0
		return -1; 
	}

	//7.23

	public static int numberOfOnes(int n)	{
		int num;

		if(n == 0) {
			num = 0;
			return num;
		}else if(n % 2 == 0) {
			num = numberOfOnes(n/2);
			return num;
		}else {
			num = 1 + numberOfOnes((n-1)/2);
			return num;
		}

	}

	//7.36 - use the nextLine() method of the Scanner class
	public static void printReverse(Scanner stuff) {
		if(stuff.hasNextLine()) {
			
			String line = stuff.nextLine();
			printReverse(stuff);
			System.out.println(line);
		}
	}

	public static void main(String [] args) throws FileNotFoundException {
		//System.out.println(numberOfOnes(100));
		Scanner input = new Scanner(new File("Countdown.txt"));
		printReverse(input);
	}
}
