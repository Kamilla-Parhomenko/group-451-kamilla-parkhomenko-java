package packagename;

public class Employee {

	String name;
	String position;
	double salary;
	
	public void increasesalary(double percent) {
		salary = (salary/100)*percent;
	}
}
