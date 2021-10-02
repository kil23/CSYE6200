package edu.neu.csye6200;

public class AbstractCat extends AbstractAnimalAPI {

	public AbstractCat() {
		super();
	}
	
	@Override
	public String toString() {
		return "AbstractAnimal Cat... toString()";
	}

	@Override
	public void speak() {
		System.out.println("Speak method .. I am a Cat extending AbstractAnimal class.");
	}

}
