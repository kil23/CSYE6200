package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {
	
	private static List<Student> studentRoster = new ArrayList<>();
	private static List<Person> personRoster = new ArrayList<>();
	
	public static void addStudent(Student student) {
		studentRoster.add(student);
	}
	
	public static void addPerson(Student student) {
		personRoster.add(student);
	}
	
	public static void sortStudentList(List<Student> studentList) {
		
		System.out.println(studentList.size() + " students in the following collection: ");
		System.out.println("======================================================================================");
		System.out.println("1. SORTING BY LAST_NAME.");
		System.out.println("--------------------------------------------------------------------------------------");

		studentList.sort(Student::compareByLastName); 
		studentList.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("2. SORTING BY GPA.");
		System.out.println("--------------------------------------------------------------------------------------");

		Collections.sort(studentList);
		studentList.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("3. SORTING BY AGE.");
		System.out.println("--------------------------------------------------------------------------------------");

		studentList.sort(Student::compareByAge);
		studentList.forEach(System.out::println);	
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("4. SORTING BY ID.");
		System.out.println("--------------------------------------------------------------------------------------");

		studentList.sort(Student::compareByID);
		studentList.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------");

	}

	public static <T> void sortPersonList(List<Person> personList) {
		
		System.out.println(personList.size() + " persons in the following collection: ");
		System.out.println("======================================================================================");
		
		System.out.println("1. SORTING BY LAST_NAME.");
		System.out.println("--------------------------------------------------------------------------------------");

		personList.sort(Person::compareByLastName); 
		personList.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("2. SORTING BY AGE.");
		System.out.println("--------------------------------------------------------------------------------------");

		personList.sort(Person::compareByAge);
		personList.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("3. SORTING BY GPA.");
		System.out.println("--------------------------------------------------------------------------------------");

		personList.sort(Student::compareTo);
		personList.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("3. SORTING BY ID.");
		System.out.println("--------------------------------------------------------------------------------------");

		personList.sort(Person::compareByID);
		personList.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------");

	}

	public StringBuilder printPersonList(List<Person> personList) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\tID\t|\tNAME\t|\tAGE\t\n");
		sb.append("---------------------------------------------------\n");


		for (Person person: personList) {
			sb.append( "\t" + person.getId() + "\t|\t" 
							+ person.getLastName() + "\t|\t" 
							+ person.getAge()).append("\n");
		}
		return sb;
	}
	
	public StringBuilder printStudentList(List<Student> studentList) {
		StringBuilder sb = new StringBuilder();	
		
		sb.append("\tID\t|\tNAME\t|\tAGE\t|\tGPA\t\n");
		sb.append("-----------------------------------------------------------------\n");

		for (Student student: studentList) {
			sb.append( "\t" + student.getId() + "\t|\t" 
							+ student.getLastName() + "\t|\t" 
							+ student.getAge() + "\t|\t" 
							+ student.getGpa()).append("\n");
		}
		return sb;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-----------------------------------------------------------------\n");
		sb.append("There are total " + personRoster.size() + " students in personList\n");
		sb.append("-----------------------------------------------------------------\n");
		sb.append("Person List : \n");
		sb.append("-----------------------------------------------------------------\n");
		sb.append(printPersonList(personRoster));
		sb.append("-----------------------------------------------------------------\n");
		sb.append("\nThere are total "+ studentRoster.size() + " students in studentList\n");
		sb.append("-----------------------------------------------------------------\n");
		sb.append("Student List : \n");
		sb.append("-----------------------------------------------------------------\n");
		sb.append(printStudentList(studentRoster));
		sb.append("\n");
		sb.append("-----------------------------------------------------------------\n");
		return sb.toString();
	}

	public static void demo() {
		
		addPerson(new Student(3, "James", 32, 3.13));
		addPerson(new Student(1, "Jessie", 34, 3.90));
		addPerson(new Student(2, "Jack", 28, 3.95));
		addPerson(new Student(4, "Jill", 30, 3.88));
		
		addStudent(new Student(2, "Adam", 21, 3.54));
		addStudent(new Student(1, "Eve", 20, 3.77));
		addStudent(new Student(5, "Ronald", 24, 3.23));
		addStudent(new Student(3, "Harry", 25, 3.69));
		addStudent(new Student(4, "Emma", 23, 3.62));

		System.out.println("\n Unsorted List : \n");
		School school = new School();	
		System.out.println(school);	

		sortPersonList(personRoster);
		sortStudentList(studentRoster);	
		
		System.out.println("\n Sorted List : \n");
		System.out.println(school);	
	}	
}
