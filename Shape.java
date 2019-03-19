/*
 * Andrew Clemons
 * Programming 4 shape hierarchy 
 * Spring 2019
 */
import java.util.ArrayList;

public class Shape { 
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Shape(double x, double y) {
		if(x > 0 && y > 0) {
			this.x = x;
			this.y = y; 
		}else {
			this.x = 0;
			this.y = 0; 
		}
	}

	public static void stretchAll(ArrayList<? extends Shape> shapes, double size) {
		for(Shape s : shapes) {
			s.stretch(size); 
		}
	}

	public void stretch(double factor) {

	}

	public static double distance(Shape a, Shape b) {
		double xDist = a.getX() - b.getX();
		double yDist = a.getY() - b.getX(); 
		
		double distance = Math.sqrt(((Math.pow(xDist,2)+(Math.pow(yDist, 2)))));
		return distance; 
	}


	public static void main (String [] args) {
		//first parameter is the size, the coordinates are the next two
		Circle circleOne = new Circle(2,3,3);
		Circle circleTwo = new Circle(1,1,1);
		System.out.println(distance(circleOne,circleTwo));
		
		Rectangle rectangleOne = new Rectangle(2,2,4,4);
		Square squareOne = new Square(2,3,3);
		System.out.println(distance(rectangleOne,squareOne));
		
		
	
	}
}

