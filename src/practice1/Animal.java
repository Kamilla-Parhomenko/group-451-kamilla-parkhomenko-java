package practice1;

public class Animal {

	void speak() {}
}
class Cat extends Animal{
	
	@Override
	void speak() {
		System.out.println("Meow!");
	}
}
