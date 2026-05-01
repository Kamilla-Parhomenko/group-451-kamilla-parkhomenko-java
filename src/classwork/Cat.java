package classwork;

public class Cat {

	String name;
	String furclr;
	int age;
	
	public Cat(String name, String furclr, int age) {
		this.name = name;
		this.furclr = furclr;
		this.age = age;
	}
	
	void meow() {
		System.out.println("Meow! My name is " + name);
	}
}
