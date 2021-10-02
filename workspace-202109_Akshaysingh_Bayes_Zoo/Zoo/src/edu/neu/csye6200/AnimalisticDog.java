package edu.neu.csye6200;

public class AnimalisticDog implements AnimalisticAPI{

	@Override
	public String toString() {
		return "Animalistic Dog... toString()";
	}
	
	@Override
	public void speak() {
		System.out.println("Speak method .. I am a Dog implementing AnimalisticAPI interface.");		
	}

}
