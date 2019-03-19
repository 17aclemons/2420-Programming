/*
 * Andrew Clemons
 * Programming 4 shape hierarchy 
 * Spring 2019
 */
public class Rectangle extends Shape {
	double height;
	double side;

	public Rectangle(double height, double side, double x, double y) {
		super(x,y);
		
		if(side > 0 && height > 0) {
			this.height = height;
			this.side = side;	 
		}else {
			throw new IllegalArgumentException();
		}
	}
	
	public void stretch(double size) {
		height = (height * size);
		side = (side * size); 
	}
}
