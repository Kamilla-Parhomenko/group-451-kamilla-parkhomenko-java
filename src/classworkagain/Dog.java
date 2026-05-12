package classworkagain;

public class Dog {

	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void bark() {
		System.out.println("woof");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>=0) {
			this.age = age;
		}
	}
}
