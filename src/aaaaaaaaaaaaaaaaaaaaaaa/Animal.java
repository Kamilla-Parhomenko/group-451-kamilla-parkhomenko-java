package aaaaaaaaaaaaaaaaaaaaaaa;

public class Animal {

	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	void makeSound() {
		System.out.println("Woof! my name is " + name);
	}
	
}
