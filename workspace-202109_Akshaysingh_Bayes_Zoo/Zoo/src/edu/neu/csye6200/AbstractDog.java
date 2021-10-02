package edu.neu.csye6200;

public class AbstractDog extends AbstractAnimalAPI {
	
	public AbstractDog() {
		super();
	}
	
	@Override
	public String toString() {
		return "AbstractAnimal Dog... toString()";
	}

	@Override
	public void speak() {
		System.out.println("Speak method .. I am a Dog extending AbstractAnimal class.");
	}

}
