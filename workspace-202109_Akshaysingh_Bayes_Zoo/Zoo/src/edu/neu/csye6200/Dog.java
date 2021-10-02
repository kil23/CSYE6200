package edu.neu.csye6200;

public class Dog extends AnimalAPI {

	public Dog() {
		super();
	}
	
	@Override
	public String toString() {
		return "Animal Dog... toString()";
	}
	
	@Override
	public void speak() {
		System.out.println("Speak method .. I am a Dog extending AnimalAPI class.");
	}
}
