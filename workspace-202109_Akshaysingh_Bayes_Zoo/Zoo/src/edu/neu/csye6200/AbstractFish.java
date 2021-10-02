package edu.neu.csye6200;

public class AbstractFish extends AbstractAnimalAPI {

	public AbstractFish() {
		super();
	}
	
	@Override
	public String toString() {
		return "AbstractAnimal Fish... toString()";
	}

	@Override
	public void speak() {
		System.out.println("Speak method .. I am a Fish extending AbstractAnimal class.");
	}

}
