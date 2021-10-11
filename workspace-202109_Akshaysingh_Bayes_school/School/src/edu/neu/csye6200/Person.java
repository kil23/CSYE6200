package edu.neu.csye6200;

public class Person {
	
	private int id;
	private String lastName;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(int id, String lastName, int age) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.age = age;
	}
	
	public static <T extends Person> int compareByID(T o1, T o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}
	
	public static <T extends Person> int compareByLastName(T o1, T o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());      
	}

	public static <T extends Person> int compareByAge(T o1, T o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}
}
