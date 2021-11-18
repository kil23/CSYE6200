package edu.neu.csye6200;

import java.util.List;

public abstract class AbstractStore {
	
	public static <T extends Item> int compareByID(T o1, T o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}
	
	public static <T extends Item> int compareByName(T o1, T o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());      
	}
	
	public static <T extends Item> int compareByPrice(T o1, T o2) {
		return Double.compare(o1.getPrice(), o2.getPrice());
	}
	
	public abstract String printList(List<Item> list);
	
	public abstract void sortList(List<Item> list);

}
