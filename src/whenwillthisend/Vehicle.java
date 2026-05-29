package whenwillthisend;

public class Vehicle {

	String brand;
	
	public Vehicle(String brand) {
		this.brand = brand;
	}
	
	void honk() {}
}
class Car extends Vehicle{
	
	String model;
	
	public Car(String brand, String model) {
		super(brand);
		this.model = model;
	}
	
	@Override
	void honk() {
		System.out.println(brand);
		System.out.println(model);
	}
}
