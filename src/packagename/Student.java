package packagename;

public class Student {

	String name;
	int age;
	int grade;
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		
		Student st1 = new Student("name", 16, 9);
		Student st2 = new Student("other name", 15, 9);
	}
}
