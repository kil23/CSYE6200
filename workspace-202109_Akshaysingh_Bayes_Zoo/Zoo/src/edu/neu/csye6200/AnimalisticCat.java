package edu.neu.csye6200;

public class AnimalisticCat implements AnimalisticAPI{
	
	@Override
	public String toString() {
		return "Animalistic Cat... toString()";
	}

	@Override
	public void speak() {
		System.out.println("Speak method .. I am a Cat implementing AnimalisticAPI interface.");
	}

}
