package packagename;

public class Rectangle {

	int width;
	int height;
	
	public int getArea(int width, int height) {
		return width*height;
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5,6);
		r1.getArea(5,6);
	}
}
