package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UniversityBase extends AbstractSchoolAPI {
	
	List<AbstractPersonAPI> employeeList = new ArrayList<>();
	List<AbstractPersonAPI> studentList = new ArrayList<>();
	
	public static List<AbstractPersonAPI> list = new ArrayList<AbstractPersonAPI>();


	@Override
	public void addEmployee(AbstractPersonAPI employee) {
		employeeList.add(employee);	
		list.add(employee);
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
		studentList.add(student);	
		list.add(student);
	}

	@Override
	public String getEmployeesInfo() {
		return null;
	}

	@Override
	public void showEmployees() {
		employeeList.forEach(System.out::println);
	}

	@Override
	public String getStudentsInfo() {
		return null;
	}

	@Override
	public void showStudents() {
		studentList.forEach(System.out::println);	
	}

	@Override
	public void show() { }
	
	@Override
	public void sortEmployees(Comparator<AbstractPersonAPI> c) {
		employeeList.sort(c);
	}

	@Override
	public void sortStudents(Comparator<AbstractPersonAPI> c) {
		studentList.sort(c);
	}
}
