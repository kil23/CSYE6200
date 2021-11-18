package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Store extends AbstractStore {
	
	public static List<Item> itemList = new ArrayList<>();
	private static List<ItemFactory> itemFactoryList = new ArrayList<>();
	
	@Override
	public String printList(List<Item> list) {
		StringBuilder sb = new StringBuilder();	
		
		sb.append("\tID\t|\tNAME\t|\tPRICE\t|\n");
		sb.append("--------------------------------------------------------------------------------------\n");
	
		for (Item item: list) {
			sb.append( "\t" + item.getId() + "\t|\t" 
							+ item.getName() + "\t|\t" 
							+ item.getPrice()+ "\t|\t\n");
		}
		return sb.toString();
	}
	
	@Override
	public void sortList(List<Item> list) {
		Store store = new Store();
		System.out.println("\n"+list.size() + " food-items in the following collection: ");
		System.out.println("======================================================================================");
		System.out.println("1. SORTING BY NAME.");
		System.out.println("--------------------------------------------------------------------------------------");

		list.sort(AbstractStore::compareByName); 
		System.out.println(store.printList(itemList));
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("2. SORTING BY PRICE");
		System.out.println("--------------------------------------------------------------------------------------");
		
		Collections.sort(itemList, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
			
		});
		System.out.println(store.printList(itemList));
		System.out.println("--------------------------------------------------------------------------------------");

		System.out.println("4. SORTING BY ID.");
		System.out.println("--------------------------------------------------------------------------------------");

		list.sort(AbstractStore::compareByID);
		System.out.println(store.printList(itemList));
		System.out.println("--------------------------------------------------------------------------------------");

	}
	
	public static void demo() {
		Store store = new Store();
		
		// Factory Pattern Calls
//		itemFactoryList.add(new ServiceItemFactory());
		itemFactoryList.add(new FoodItemFactory());
//		itemFactoryList.add(new ElectronicItemFactory());
		//itemList.add(ServiceItemFactory.getInstance().getObject());
		
		itemFactoryList.stream().forEach(ItemFactory::getObject);
		
		System.out.println("\nItem list size : " + itemList.size()+"\n");
		
		itemList.stream().forEach(System.out::println);
		
		store.sortList(itemList);
		
		// Singleton Pattern Call
		itemFactoryList.add(ElectronicItemFactory.getInstance());
		itemFactoryList.add(ServiceItemFactory.getInstance());
		
		itemFactoryList.get(3).getObject();
		itemFactoryList.get(4).getObject();
		
		System.out.println("\nSingleton Item list size : "+ itemList.size()+"\n");
		
		System.out.println(store.printList(itemList));
	}

}
