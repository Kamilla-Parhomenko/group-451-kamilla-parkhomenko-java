package classworkagain;

public class Car {

	String carModel;
	
	public Car(String carModel) {
		this.carModel = carModel;
	}
}

class Engine extends Car{
	
	public Engine(String carModel) {
		super(carModel);
	}

	void start() {
		System.out.println("Engine started in" + carModel);
	}
}
