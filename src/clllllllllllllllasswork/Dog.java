package clllllllllllllllasswork;

public class Dog {

	String name;
	String breed;
	int age;
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	void bark() {
		System.out.println(name + " says: Woof!");
	}
	
	void introduce() {
		System.out.println(name + ", " + breed + ", " + age);
	}
}
