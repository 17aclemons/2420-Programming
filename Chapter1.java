
public class Chapter1 {

	public static void main(String [] args) {
		addition();
		System.out.println();
		multiplication();
		System.out.println();
		positive();
	}

	//1.16
	public static void addition() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(i+j +  " ");
				if(j == 9) {
					System.out.println();
				}
			}
		}
	}

	public static void multiplication() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i*j +  " ");
				if(j == 9) {
					System.out.println();
				}
			}
		}
	}

	//1.19
	//a^2 + b^2 +1 / a*b
	public static void positive() {
		for(int a = 1; a < 1000; a++) {
			for(int b = 1; b < 1000; b++) {
				if(a < b && b < 1000) {

					int c = (int)((Math.pow(a,2)+ Math.pow(b, 2)+1)/a*b);
					double d = ((Math.pow(a,2)+ Math.pow(b, 2)+1)/a*b);
					
					if(d/c == 1) {
						System.out.print("(" + a + "," + b +")");
					}

				}
			}
		}
		System.out.print("worked");
	}
}
