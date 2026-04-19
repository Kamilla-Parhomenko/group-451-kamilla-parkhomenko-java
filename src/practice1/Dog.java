package practice1;

public class Dog {

	String name;
	int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void bark() {
		System.out.println("Woof! Im " + name);
	}
}
