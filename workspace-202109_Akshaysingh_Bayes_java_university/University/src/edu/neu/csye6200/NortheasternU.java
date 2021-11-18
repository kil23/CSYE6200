package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NortheasternU extends UniversityBase{
	
	private List<AbstractPersonAPI> list = new ArrayList<AbstractPersonAPI>();
	
	public void addToList(List<AbstractPersonAPI> l) {
		list.addAll(l);
	}
	
	@Override
	public String toString() {
		return "\nNortheasternU [list=" + list + "]";
	}
	
	@Override
	public void show() {
		//toString();
		System.out.println("\n-----------------------Showing NorthestrernU Object-----------------------");
		for (AbstractPersonAPI element : list) {
			System.out.println(element);
		}
	}
	
	public static void demo() {
		
		NortheasternU northeasternU = new NortheasternU();
		Student S1 = new Student("2,15,Donald,Shaw,3.2");
		northeasternU.addStudent(S1);
		Student S2 = new Student("4,17,Victor,Champ,3.1");
		northeasternU.addStudent(S2);
		northeasternU.addStudent(StudentFactory.getInstance().getObject());
		
		northeasternU.addToList(northeasternU.studentList);
		System.out.println("-------------------Showing student list-------------------");
		northeasternU.showStudents();
		
		
		Employee E1 = new Employee("6,37,Emily,Reid,40.6");
		northeasternU.addEmployee(E1);
		Employee E2 = new Employee("11,29,Tia,Garcia,36.2");
		northeasternU.addEmployee(E2);
		northeasternU.addEmployee(EmployeeFactory.getInsance().getObject());	
		northeasternU.addToList(northeasternU.employeeList);
		
		System.out.println("\n-------------------Showing employee list-------------------");
		northeasternU.showEmployees();
		
		northeasternU.show();
		
		System.out.println("\n-------------------Sorting student list By Id-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				return Integer.compare(arg0.getId(), arg1.getId());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		System.out.println("\n-------------------Sorting employee list By Id-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				return Integer.compare(arg0.getId(), arg1.getId());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		
		System.out.println("\n-------------------Sorting student list By Age-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.getAge(), arg1.getAge());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		System.out.println("\n-------------------Sorting employee list By Age-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.getAge(), arg1.getAge());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		
		System.out.println("\n-------------------Sorting student list By First Name-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return arg0.getFirstName().compareToIgnoreCase(arg1.getFirstName());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		System.out.println("\n-------------------Sorting employee list By First Name-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return arg0.getFirstName().compareToIgnoreCase(arg1.getFirstName());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		
		System.out.println("\n-------------------Sorting student list By Last Name-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return arg0.getLastName().compareToIgnoreCase(arg1.getLastName());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		
		
		System.out.println("\n-------------------Sorting employee list By Last Name-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				// TODO Auto-generated method stub
				return arg0.getLastName().compareToIgnoreCase(arg1.getLastName());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		System.out.println("\n-------------------Sorting student list By GPA-------------------");
		northeasternU.sortStudents(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				Student s1 = (Student) arg0;
				Student s2 = (Student) arg1;
				return Double.compare(s1.getGpa(), s2.getGpa());
			}
		});
		northeasternU.showStudents();
		System.out.println(northeasternU);
		
		
		System.out.println("\n-------------------Sorting employee list By Wage-------------------");
		northeasternU.sortEmployees(new Comparator<AbstractPersonAPI>() {
			
			@Override
			public int compare(AbstractPersonAPI arg0, AbstractPersonAPI arg1) {
				Employee e1 = (Employee) arg0;
				Employee e2 = (Employee) arg1;
				return Double.compare(e1.getWage(), e2.getWage());
			}
		});
		northeasternU.showEmployees();
		System.out.println(northeasternU);
		
		northeasternU.show();
	}

}
