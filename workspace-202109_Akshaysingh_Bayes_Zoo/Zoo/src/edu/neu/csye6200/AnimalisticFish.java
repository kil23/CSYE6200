package edu.neu.csye6200;

public class AnimalisticFish implements AnimalisticAPI{

	@Override
	public String toString() {
		return "Animalistic Fish... toString()";
	}
	
	public void speak() {
		System.out.println("Speak method .. I am a Fish implementing AnimalisticAPI interface.");		
	}

}
