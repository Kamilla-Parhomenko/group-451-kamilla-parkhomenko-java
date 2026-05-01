package classwork;

public class Rectangle {

	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double area() {
		return width*height;
	}
	
	double perimeter() {
		return (width+height)*2;
	}
	
	void descr() {
		System.out.println(width);
		System.out.println(height);
		System.out.println(area());
		System.out.println(perimeter());
	}
}
