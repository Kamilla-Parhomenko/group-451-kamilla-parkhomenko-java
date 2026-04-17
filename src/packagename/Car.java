package packagename;

public class Car {

	String brand;
	String model;
	int year;
	
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public static void main(String[] args) {
		
		Car car = new Car("brand", "model", 1997);
	}
}
