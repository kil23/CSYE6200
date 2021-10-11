package edu.neu.csye6200;

public class Student extends Person implements Comparable<Student>{

	private double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(int id, String lastName, int age) {
		super(id, lastName, age);
	}
	
	public Student(int id, String lastName, int age, double gpa) {
		super(id, lastName, age);
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student Name: " + getLastName() + ", ID: " + getId() + ", Age: " + getAge() + ", GPA: "+ getGpa() + "\n";
	}
	
	public static int compareTo(Person o1, Person o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return Double.compare(s1.getGpa(), s2.getGpa());
	}

	@Override
	public int compareTo(Student o) {
		return Double.compare(this.gpa, o.getGpa());
	}
	
}
