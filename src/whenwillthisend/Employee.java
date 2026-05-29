package whenwillthisend;

public class Employee {

	String name;
	int baseSalary;
	
	Employee(String name, int baseSalary){
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	int calculateSalary() {
		return baseSalary;
	}
}

class Manager extends Employee{

	Manager(String name, int baseSalary) {
		super(name, baseSalary);
	}
	
	@Override
	int calculateSalary() {
		return baseSalary+=150;
	}
	
}

class Intern extends Employee {

	Intern(String name, int baseSalary) {
		super(name, baseSalary);
	}
	
	@Override
	int calculateSalary() {
		return baseSalary/2;
	}
	
}
