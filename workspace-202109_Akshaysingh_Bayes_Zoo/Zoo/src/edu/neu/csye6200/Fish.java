package edu.neu.csye6200;

public class Fish extends AnimalAPI {
	
	public Fish() {
		super();
	}
	
	@Override
	public String toString() {
		return "Animal Fish... toString()";
	}

	@Override
	public void speak() {
		System.out.println("Speak method .. I am a Fish extending AnimalAPI class.");
	}
}
