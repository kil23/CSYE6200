package edu.neu.csye6200;

public class Student extends Person implements Comparable<AbstractPersonAPI> {
	
	private double gpa;
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student() {
		super();
	}

	public Student(int id, int age, String firstName, String lastName, double gpa) {
		super(id, age, firstName, lastName);
		this.gpa = gpa;
	}
	
	public Student(String csvString) {
		parseCsvString(csvString);
	}

	private void parseCsvString(String csvString) {
		
		String[] fields = csvString.split(",");
		
		try {
			this.setId(Integer.parseInt(fields[0]));
		} catch (NumberFormatException e) {
			System.err.println("'"+fields[0]+"' is not a valid");
		}
		
		try {
			this.setAge(Integer.parseInt(fields[1]));
		} catch (NumberFormatException e) {
			System.err.println("'"+fields[1]+"' is not a valid");
		}

		this.setFirstName(fields[2]);
		this.setLastName(fields[3]);
		try {
			this.setGpa(Double.parseDouble(fields[4]));
		} catch (NumberFormatException e) {
			System.err.println("'"+fields[1]+"' is not a valid");
		}
	}

	
	
	@Override
	public String toString() {
		return "Student [Gpa=" + gpa + ", Id=" + getId() + ", FirstName="
				+ getFirstName() + ", LastName=" + getLastName() + ", Age=" + getAge() + "]";
	}

	@Override
	public void show() {
		toString();
	}
	
	@Override
	public int compareTo(AbstractPersonAPI o) {
		Student s = (Student) o;
		return Double.compare(this.getGpa(), s.getGpa());
	}
}
