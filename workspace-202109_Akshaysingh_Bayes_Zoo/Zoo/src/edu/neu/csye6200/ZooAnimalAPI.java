package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimalAPI {
	private static List<AnimalAPI> list = null;
	{
		list = new ArrayList<>();
	}
	
	public void add(AnimalAPI animal) {
		list.add(animal);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nThere are total "+list.size() + " animals in zoo.").append("\n");
		for (AnimalAPI animal: list) {
			animal.speak();

			sb.append(animal.toString()).append("\n");
		}
		
		return sb.toString();
	}
	
	public static void demo() {
		AnimalAPI animal = new AnimalAPI();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Fish fish = new Fish();
		
		ZooAnimalAPI zoo = new ZooAnimalAPI();
		zoo.add(animal);
		zoo.add(cat);
		zoo.add(dog);
		zoo.add(fish);
		System.out.println(zoo);	
		
	}
}
