/*
 * Andrew Clemons
 * Programming 4 shape hierarchy 
 * Spring 2019
 */
public class Square extends Shape{
	double side;
	
	public Square(double side, double x, double y) {
		super(x,y);
		
		if(side > 0) {
			this.side = side; 
		}else {
			throw new IllegalArgumentException();
		}

	}
	
	public void stretch(double size) {
		side = (side * size);
	}
}
