package edu.neu.csye6200;

public class Cat extends AnimalAPI {
	
	public Cat() {
		super();
	}
	
	@Override
	public String toString() {
		return "Animal Cat... toString()";
	}

	@Override
	public void speak() {
		System.out.println("Speak method .. I am a Cat extending AnimalAPI class.");
	}
}
