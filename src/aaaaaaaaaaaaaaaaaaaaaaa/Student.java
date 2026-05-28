package aaaaaaaaaaaaaaaaaaaaaaa;

public class Student {

	String name;
	String group;
	int[] grades;
	
	public Student(String name, String group, int[] grades) {
		this.name = name;
		this.group = group;
		this.grades = grades;
	}
	
	int avgGrade() {
		int sum = 0;
		for(int g : grades) {
			sum+=g;
		}
		int avg = sum/grades.length;
		return avg;
	}
	
	
}
