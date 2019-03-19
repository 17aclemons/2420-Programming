/*
 * Andrew Clemons
 * Programming 4 shape hierarchy 
 * Spring 2019
 */
public class Circle extends Shape implements Comparable<Circle> {
	private double radius;

		
	public Circle(double radius, double x, double y) {
		super(x,y);
		
		if(radius > 0) {
			this.radius = radius;
		}else {
			throw new IllegalArgumentException(); 
		}
	}
	
	public void stretch(double size) {
		radius = (radius * size); 
	}

	@Override
	public int compareTo(Circle circle2) {
		if(this.radius > circle2.getRadius()) {
			return 1; 
		}else if(this.radius < circle2.getRadius()) {
			return -1;
		}else {
			return 0; 
		}
	}
	
	public double getRadius() {
		return radius; 
	}


}
