package classwork_7;

public class Car {
 
	String brand;
	double speed;
	double fuel;
	
	public Car(String brand, double speed, double fuel) {
		this.brand = brand;
		this.speed = speed;
		this.fuel = fuel;
	}
	public void drive() {
		System.out.println("drive");
	}
	
	public void refuel(int amount) {
		fuel+=amount;
	}
}
