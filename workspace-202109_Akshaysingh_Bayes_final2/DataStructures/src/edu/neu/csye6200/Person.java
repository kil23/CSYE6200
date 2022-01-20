package edu.neu.csye6200;

public class Person extends AbstractPerson {
	
	private int id;
	private int age;
	private String name;
	private int weightLbs;
	private int weightLossLbs;
	
	public Person() {
		super();
	}

	public Person(int id, int age, String name, int weightLbs, int weightLossLbs) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.weightLbs = weightLbs;
		this.weightLossLbs = weightLossLbs;
	}

	public Person(String csvDataString) {
		super();
		
		String[] tokens = csvDataString.split(",");
		int id = 0;
		int age = 0;
		int weightLbs = 0;
		int weightLossLbs = 0;
		
		try {
			id = Integer.parseInt(tokens[0]);
		} catch (NumberFormatException e) {
			System.err.println("ERROR: Invalid Person ID String encoded int '" + tokens[0] + "'");
			e.printStackTrace();
		}
		
		try {
			age = Integer.parseInt(tokens[1]);
		} catch (NumberFormatException e) {
			System.err.println("ERROR: Invalid Person Age String encoded int '" + tokens[1] + "'");
			e.printStackTrace();
		}
		
		try {
			weightLbs = Integer.parseInt(tokens[3]);
		} catch (NumberFormatException e) {
			System.err.println("ERROR: Invalid Person WeightLbs String encoded int '" + tokens[3] + "'");
			e.printStackTrace();
		}
		
		try {
			weightLossLbs = Integer.parseInt(tokens[4]);
		} catch (NumberFormatException e) {
			System.err.println("ERROR: Invalid Person WeightLossLbs String encoded int '" + tokens[4] + "'");
			e.printStackTrace();
		}
		this.setId(id);
		this.setAge(age);
		this.setName(tokens[2]);
		this.setWeightLbs(weightLbs);
		this.setWeightLossLbs(weightLossLbs);
	}
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeightLbs() {
		return weightLbs;
	}
	public void setWeightLbs(int weightLbs) {
		this.weightLbs = weightLbs;
	}
	public int getWeightLossLbs() {
		return weightLossLbs;
	}
	public void setWeightLossLbs(int weightLossLbs) {
		this.weightLossLbs = weightLossLbs;
	}
	
	@Override
	public String toString() {
		return "Person [ID = " + getId() + ", Age = " + getAge() + ", Name = " + getName() + 
				", WeightLbs = "+ getWeightLbs() + ", WeightLossLbs = " + getWeightLossLbs() + "]";
	}
}
