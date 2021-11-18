package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends Person implements Comparable<Student> {

	private static List<Student> studentList = new ArrayList<>();
	
	private int studentId;
	private double gpa;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(int id, String firstName, String lastName, int age, String parentFirstName, String parentLastName,
			int studentId, double gpa) {
		super(id, age, firstName, lastName, parentFirstName, parentLastName);
		this.studentId = studentId;
		this.gpa = gpa;
	}
	
	public Student() {
		super();
	}
	
	public static int compareByStudentID(Student o1, Student o2) {
		return Integer.compare(o1.getStudentId(), o2.getStudentId());
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(this.gpa, o.getGpa());
	}
	
public static void sortStudentList(List<Student> studentList) {
		Student student = new Student();
		
		System.out.println(studentList.size() + " students in the following collection: ");
		System.out.println("======================================================================================");
		System.out.println("1. SORTING BY FIRST_NAME.");
		System.out.println("--------------------------------------------------------------------------------------");

		studentList.sort(Student::compareByFirstName); 
		System.out.println(student);
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("1. SORTING BY LAST_NAME.");
		System.out.println("--------------------------------------------------------------------------------------");

		studentList.sort(Student::compareByLastName); 
		System.out.println(student);
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("2. SORTING BY GPA.");
		System.out.println("--------------------------------------------------------------------------------------");

		Collections.sort(studentList);
		System.out.println(student);
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("3. SORTING BY AGE.");
		System.out.println("--------------------------------------------------------------------------------------");

		studentList.sort(Student::compareByAge);
		System.out.println(student);
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("4. SORTING BY Student_ID.");
		System.out.println("--------------------------------------------------------------------------------------");

		studentList.sort(Student::compareByStudentID);
		System.out.println(student);
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("4. SORTING BY ID.");
		System.out.println("--------------------------------------------------------------------------------------");

		studentList.sort(Student::compareByID);
		System.out.println(student);
		System.out.println("--------------------------------------------------------------------------------------");

	}

	public StringBuilder printStudentList(List<Student> studentList) {
		StringBuilder sb = new StringBuilder();	
		
		sb.append("\tID\t|\tFNAME\t|\tLNAME\t|\tAGE\t|\tP_FNAME\t|\tP_LNAME\t|\tSTU_ID\t|\tGPA\t|\n");
		sb.append("--------------------------------------------------------------------------------------\n");
	
		for (Student student: studentList) {
			sb.append( "\t" + student.getId() + "\t|\t" 
							+ student.getFirstName() + "\t|\t" 
							+ student.getLastName() + "\t|\t" 
							+ student.getAge() + "\t|\t" 
							+ student.getParentFirstName() + "\t|\t" 
							+ student.getParentLastName() + "\t|\t" 
							+ student.getStudentId() + "\t|\t" 
							+ student.getGpa()+ "\t|\t").append("\n");
		}
		return sb;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------------------------------------------------------------------------------\n");
		sb.append("There are total "+ studentList.size() + " students in studentList\n");
		sb.append("--------------------------------------------------------------------------------------\n");
		sb.append("Student List : \n");
		sb.append("--------------------------------------------------------------------------------------\n");
		sb.append(printStudentList(studentList));
		sb.append("\n");
		sb.append("--------------------------------------------------------------------------------------\n");
		return sb.toString();
	}
	
	public static void demo() {
		
		String[] csvString = {	
				"1,Tyler,Jones,16,Will,Diaz,123,3.80", 
				"2,Leo,Smith,14,Sam,Brown,106,3.70",
				"3,Casey,Shah,15,Raj,Shah,194,3.60",
				"4,Rob,Davis,13,Mary,Ray,157,3.66",
				"5,Amy,Cook,15,Emma,Miller,118,3.42"
		};
		
		FileUtil<Student> util = new FileUtil<Student>();
		util.set(new Student());
		String fileName = util.writeCSV(csvString);
		
		studentList = util.readCSV(fileName);
		
		System.out.println("\nUnsorted List : ");
		Student student = new Student();	
		System.out.println(student);
		
		sortStudentList(studentList);
	}
}
