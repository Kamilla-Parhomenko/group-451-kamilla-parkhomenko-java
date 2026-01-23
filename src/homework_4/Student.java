package homework_4;

public class Student {
	
	String name;
	int age;
	double avgGrade;
	
	public Student(String name, int age, double avgGrade) {
		this.name = name;
		this.age = age;
		this.avgGrade = avgGrade;
		
		public void printInfo() {
			System.out.println(name, age, avgGrade);
		}
		
		
	}
	
}
