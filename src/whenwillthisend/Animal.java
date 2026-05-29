package whenwillthisend;

public class Animal {

	void sound() {}
}

class Dog extends Animal{
	
	@Override
	void sound() {
		System.out.println("Woof");
	}
}

class Cat extends Animal{
	
	@Override
	void sound() {
		 System.out.println("Meow");
	}
}