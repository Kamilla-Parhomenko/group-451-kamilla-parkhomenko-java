package whenwillthisend;

public abstract class SmartDevice {

	String brand;
	
	public SmartDevice(String brand) {
		this.brand = brand;
	}
	
	abstract void powerOn();
}

class Smartphone extends SmartDevice {
	
	String os;
	
	public Smartphone(String brand, String os) {
		super(brand);
		this.os = os;
	}
	
	@Override
	void powerOn() {
		System.out.println("booting...");
	}
	
}

class Laptop extends SmartDevice {

	double ramSize;
	
	public Laptop(String brand, double ramSize) {
		super(brand);
		this.ramSize = ramSize;
	}

	@Override
	void powerOn() {}
	
	
}
