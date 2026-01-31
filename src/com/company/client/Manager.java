package com.company.client;
import com.company.base.Employee;
public class Manager extends Employee {

	public void changeDep(String newDep) {
        department = newDep;
        printDepartment();
	}
}
