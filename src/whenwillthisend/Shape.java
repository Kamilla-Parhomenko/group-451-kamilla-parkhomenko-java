package whenwillthisend;

public abstract class Shape {

	abstract double area();
}

abstract class Circle extends Shape {
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	double area() {
		return Math.pow(radius, 2)*Math.PI;
	}
}

abstract class Rectangle extends Shape {
	
	double height;
	double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	double area() {
		return height*width;
	}
}
