package classwork;

public class Car {

	String brand;
	String model;
	int year;
	int speed;
	
	public Car(String brand, String model, int year, int speed) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.speed = 0;
	}
	
	void accelerate(int kmh) {
		if(kmh<=200) {
			speed+=kmh;
		} 
	}
	
	void brake(int kmh) {
		if(kmh<speed) {
			speed-=kmh;
		}
	}
}
