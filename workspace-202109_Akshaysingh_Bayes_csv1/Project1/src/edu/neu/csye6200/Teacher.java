package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	
	private static List<Teacher> teacherList = new ArrayList<>();

	private double hourlyWage;

	public Teacher(int id, String fname, String lname, int age, String parentFname, String parentLname,
			double hourlyWage) {
		super(id, age, fname, lname, parentFname, parentLname);
		this.hourlyWage = hourlyWage;
	}
	
	public Teacher() { }

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	public StringBuilder printTeacherList(List<Teacher> teacherList) {
		StringBuilder sb = new StringBuilder();	
		
		sb.append("\tID\t|\tFNAME\t|\tLNAME\t|\tAGE\t|\tP_FNAME\t|\tP_LNAME\t|\tHRLY_WAGE\t|\n");
		sb.append("--------------------------------------------------------------------------------------\n");
	
		for (Teacher teacher: teacherList) {
			sb.append( "\t" + teacher.getId() + "\t|\t" 
							+ teacher.getFirstName() + "\t|\t" 
							+ teacher.getLastName() + "\t|\t" 
							+ teacher.getAge() + "\t|\t" 
							+ teacher.getParentFirstName() + "\t|\t" 
							+ teacher.getParentLastName() + "\t|\t" 
							+ teacher.getHourlyWage() + "\t|\t").append("\n");
		}
		return sb;
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------------------------------------------------------------------------------\n");
		sb.append("There are total "+ teacherList.size() + " teacher in teacherList\n");
		sb.append("--------------------------------------------------------------------------------------\n");
		sb.append("Teacher List : \n");
		sb.append("---------------------------------------------------------------------------------------\n");
		sb.append(printTeacherList(teacherList));
		sb.append("\n");
		sb.append("--------------------------------------------------------------------------------------\n");
		return sb.toString();
	}
	
	public static void demo() {
		String[] csvString = {	
				"1,Tom,Hanks,45,David,Hanks,55.50", 
				"2,Chris,Evans,42,Robert,Evans,42.50"
		};
		
		FileUtil<Teacher> util = new FileUtil<Teacher>();
		util.set(new Teacher());
		String fileName = util.writeCSV(csvString);
		
		teacherList = util.readCSV(fileName);
		
		System.out.println("\nUnsorted List : ");
		Teacher teacher = new Teacher();	
		System.out.println(teacher);
	}
}
