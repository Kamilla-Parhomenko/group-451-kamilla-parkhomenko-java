package classworkagain;

public class Rectangle {

	int height;
	int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(int width) {
		this.width = width;
		this.height = width;
	}
	
	int area() {
		return width*height;
	}
}
