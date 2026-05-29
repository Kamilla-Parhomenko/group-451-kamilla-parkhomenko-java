package whenwillthisend;

public class Person {

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}

class Student extends Person {

	String studentId;
	
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
}