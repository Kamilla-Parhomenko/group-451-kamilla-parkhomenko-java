package whenwillthisend;

public abstract class ThreeDShape {
	
	abstract double volume();
	
	
}

class Sphere extends ThreeDShape {

	double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	@Override
	double volume() {
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}
	
}

class Cube extends ThreeDShape{
	
	double side;
	
	public Cube(double side) {
		this.side = side;
	}
	
	@Override
	double volume() {
		return Math.pow(side, 3);
	}
}