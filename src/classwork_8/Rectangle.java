package classwork_8;

public class Rectangle {

	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getA() {
		return height*width;
	}
	
	public double getP() {
		return 2*(height+width);
	}
	
	public void printinfo() {
		System.out.println(height);
		System.out.println(width);
		System.out.println(getA());
		System.out.println(getP());
	}
	
}
