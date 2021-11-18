package edu.neu.csye6200;

public class Person {
	
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String parentFirstName;
	private String parentLastName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getParentFirstName() {
		return parentFirstName;
	}
	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}
	public String getParentLastName() {
		return parentLastName;
	}
	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}
	public Person(int id, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.parentFirstName = parentFirstName;
		this.parentLastName = parentLastName;
	}
	
	public Person() { }
	
	public static <T extends Person> int compareByID(T o1, T o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}
	
	public static <T extends Person> int compareByFirstName(T o1, T o2) {
		return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());      
	}
	
	public static <T extends Person> int compareByLastName(T o1, T o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());      
	}

	public static <T extends Person> int compareByAge(T o1, T o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
