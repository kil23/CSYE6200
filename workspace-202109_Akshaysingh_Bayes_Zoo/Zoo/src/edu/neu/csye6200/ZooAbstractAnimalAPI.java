package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimalAPI {
	private static List<AbstractAnimalAPI> list = null;
	{
		list = new ArrayList<>();
	}
	
	public void add(AbstractAnimalAPI animal) {
		list.add(animal);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nThere are total "+list.size() + " animals in zoo.").append("\n");
		for (AbstractAnimalAPI animal: list) {
			animal.speak();

			sb.append(animal.toString()).append("\n");
		}
		
		return sb.toString();
	}
	
	public static void demo() {
		AbstractCat cat = new AbstractCat();
		AbstractDog dog = new AbstractDog();
		AbstractFish fish = new AbstractFish();
		
		ZooAbstractAnimalAPI zoo = new ZooAbstractAnimalAPI();
		zoo.add(cat);
		zoo.add(dog);
		zoo.add(fish);
		System.out.println(zoo);	
		
	}
}
