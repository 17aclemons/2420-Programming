
public class CombinationLock {
	private int a;
	private int b;
	private int c; 

	CombinationLock(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c; 
	}

	public CombinationLock() {
		a = 18;
		b = 55;
		c = 17;
	}

	public boolean open(int first, int second, int third) {
		if(a == first && b == second && c == third) {
			System.out.println("Lock is open");
			return true;
		}else {
			return false; 
		}
	}

	public void changeCombo(int first, int second, int third) {

		if(a == first && b == second && c == third) {
			first = (int)(Math.random()*100); 
			second = (int)(Math.random()*100);
			third = (int)(Math.random()*100);
		}
		a = first;
		b = second;
		c = third; 
		System.out.println("the new combination is " + first + " " + second + " " + third);
	}

	public static void main(String [] args) {
		CombinationLock lockOne = new CombinationLock(13,12,1);

		lockOne.open(13, 12, 1);
		lockOne.changeCombo(13, 12, 1);

	}
}
