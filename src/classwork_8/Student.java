package classwork_8;

public class Student {

	String name;
	int age;
	double avgrade;
	
	public Student(String name, int age, double avgrade) {
		this.name = name;
		this.age = age;
		this.avgrade = avgrade;
	}
	
	public boolean excel() {
		if(avgrade>=90) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		System.out.println(name + age + avgrade);
	}
}
