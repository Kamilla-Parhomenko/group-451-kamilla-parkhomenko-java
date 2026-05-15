package clllllllllllllllasswork;

public class Rectangle {

	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double area() {
		return width * height;
	}
	
	double perimeter() {
		return 2*(width + height);
	}
	
	boolean isSquare() {
		boolean ans = (width==height) ? true : false;
		return ans;
	}
}
