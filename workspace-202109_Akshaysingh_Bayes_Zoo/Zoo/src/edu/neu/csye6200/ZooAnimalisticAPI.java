package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimalisticAPI {
	
	private static List<AnimalisticAPI> list = null;
	{
		list = new ArrayList<>();
	}
	
	public void add(AnimalisticAPI animal) {
		list.add(animal);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nThere are total "+list.size() + " animals in zoo.").append("\n");
		for (AnimalisticAPI animal: list) {
			animal.speak();

			sb.append(animal.toString()).append("\n");
		}
		
		return sb.toString();
	}
	
	public static void demo() {
		AnimalisticCat cat = new AnimalisticCat();
		AnimalisticDog dog = new AnimalisticDog();
		AnimalisticFish fish = new AnimalisticFish();
		
		ZooAnimalisticAPI zoo = new ZooAnimalisticAPI();
		zoo.add(cat);
		zoo.add(dog);
		zoo.add(fish);
		System.out.println(zoo);	
	}
}
