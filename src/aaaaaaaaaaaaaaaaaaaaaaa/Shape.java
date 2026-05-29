package aaaaaaaaaaaaaaaaaaaaaaa;

public abstract class Shape {

	abstract double getarea();
}

abstract class Circle extends Shape {
	
	int radius;
	
	@Override
	 double getarea() {
		return Math.pow(radius, 2)*Math.PI;
	}
}

abstract class Rectangle extends Shape{
	
	double height;
	double width;
	
	@Override
	double getarea() {
		return height*width;
	}
}