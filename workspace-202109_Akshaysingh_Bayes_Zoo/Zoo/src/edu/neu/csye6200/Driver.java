package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		ZooAnimalAPI.demo();
		
		System.out.println("===========================================================================");
		
		ZooAbstractAnimalAPI.demo();
		
		System.out.println("===========================================================================");
		
		ZooAnimalisticAPI.demo();
	}
}

/**
 * 
 * OUTPUT
 * 
I am an animalAPI... toString()
Speak method .. I am a Cat extending AnimalAPI class.
Speak method .. I am a Dog extending AnimalAPI class.
Speak method .. I am a Fish extending AnimalAPI class.

There are total 4 animals in zoo.
I am an animalAPI... toString()
Animal Cat... toString()
Animal Dog... toString()
Animal Fish... toString()

===========================================================================
Speak method .. I am a Cat extending AbstractAnimal class.
Speak method .. I am a Dog extending AbstractAnimal class.
Speak method .. I am a Fish extending AbstractAnimal class.

There are total 3 animals in zoo.
AbstractAnimal Cat... toString()
AbstractAnimal Dog... toString()
AbstractAnimal Fish... toString()

===========================================================================
Speak method .. I am a Cat implementing AnimalisticAPI interface.
Speak method .. I am a Dog implementing AnimalisticAPI interface.
Speak method .. I am a Fish implementing AnimalisticAPI interface.

There are total 3 animals in zoo.
Animalistic Cat... toString()
Animalistic Dog... toString()
Animalistic Fish... toString()

*/
