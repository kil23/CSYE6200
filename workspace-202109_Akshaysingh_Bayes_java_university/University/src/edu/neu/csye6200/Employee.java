package edu.neu.csye6200;

public class Employee extends Person implements Comparable<AbstractPersonAPI>{
	
	private double wage;

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public Employee() {
		super();
	}

	public Employee(int id, int age, String firstName, String lastName, double wage) {
		super(id, age, firstName, lastName);
		this.wage = wage;
	}
	
	public Employee(String employeeCsvString) {
		parseCsvString(employeeCsvString);
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
			this.setWage(Double.parseDouble(fields[4]));
		} catch (NumberFormatException e) {
			System.err.println("'"+fields[1]+"' is not a valid");
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [Wage=" + wage +  ", Id=" + getId() + ", FirstName="
				+ getFirstName() + ", LastName=" + getLastName() + ", Age=" + getAge() + "]";
	}

	@Override
	public void show() {
		toString();
	}

	@Override
	public int compareTo(AbstractPersonAPI o) {
		Employee e = (Employee) o;
		return Double.compare(this.getWage(), e.getWage());
	}
}
