package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Item {
	
	private int itemId;
	private String itemName;
	private double price;
	
	public Item(int itemId, String itemName, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void demo() {
		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item(1, "Milk", 4.99));
		itemList.add(new Item(2, "Chicken", 7.99));	
		itemList.add(new Item(3, "Juice", 2.99));	
		itemList.add(new Item(4, "Bread", 3.99));	
		
		double initialAmt = 20.0;
		System.out.println("Item \t Price");
		for(Item i : itemList) {
			if(i.getPrice() < initialAmt) {
				System.out.println(i.getItemName() + "\t"+ i.getPrice());
				initialAmt -= i.getPrice();
			}			
		}
		
		System.out.println("Total "+ String.format("%.2f", (20 - initialAmt)));
		System.out.println("Change "+ String.format("%.2f", initialAmt));
	}
	
	

}
