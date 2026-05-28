package aaaaaaaaaaaaaaaaaaaaaaa;

public class Phone {

	  String brand;
	  String model;
	  int batterylife;
	  
	  public Phone(String brand, String model, int batterylife) {
		  this.brand = brand;
		  this.model = model;
		  this.batterylife = batterylife;
	  }
	  
	  void call(int duration) {
		  batterylife-=duration/10;
	  }
}
