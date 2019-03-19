/*
 * Andrew Clemons
 * Programming 3, question 3.31
 * Spring 2019
 */

public class BigComplex {

	private double a;
	private double b;

	// two argument constructor
	BigComplex(double a, double b){
		this.a = a; 
		this.b = b; 
	}

	// one argument constructor
	BigComplex(double a){
		this.a = a;
		this.b = 0; 
	}

	//no argument
	BigComplex(){
		this.a = 0;
		this.b = 0; 
	}

	//String constructor
	BigComplex(String equation){
		String[] parts = equation.split(" ");
		/*assuming equation is enter similar to "4 + 4i" 
		the first coefficient should be at spot 0 and the second
		at spot 2 the operation sign is at spot 1
		 */
		this. a = (double) Integer.parseInt(parts[0]);
		String[] stuff = parts[2].split("i");
		this. b = (double) Integer.parseInt(stuff[0]);

	}

	public void add(BigComplex c) {
		this.a =+ c.getA(); 
		this.b =+ c.getB(); 
	}

	public void subtract(BigComplex c) {
		this.a =+ c.getA(); 
		this.b =+ c.getB(); 
	}

	public boolean equals(BigComplex c) {
		if(getA() == c.getA() && getB() == c.getB()) {
			return true;
		}else {
			return false; 
		}
	}

	public String toString() {
		if(getA() == 0) {
			return getB() + "i";
		}else if(getB() == 0){
			return getA() + "";
		}else if (getB() < 0)
			return getA() + " - " + (-getB()) + "i";
		else
			return a + " + " + b + "i";
	}

	//getters
	public double getA() {
		return a; 
	}

	public double getB() {
		return b; 
	}

	public static void main(String []args) {



		//two argument
		BigComplex  one = new BigComplex(4,4);
		//one argument
		BigComplex two = new BigComplex(1);
		//no argument
		BigComplex three = new BigComplex();
		//String argument
		BigComplex four = new BigComplex("4 + 4i");

		// adds BigComplexs
		one.add(two);

		//subtract one and two
		one.subtract(two);

		//checks if two complexes are equal
		one.equals(two);

		//two string method
		one.toString();


	}

}

