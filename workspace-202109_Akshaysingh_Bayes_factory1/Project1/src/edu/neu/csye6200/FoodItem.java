package edu.neu.csye6200;

public class FoodItem extends Item {
		
	private static String[] csvString = {	
			"1,Cake,11.80", 
			"2,Bread,03.70",
			"3,Milk,04.60",
			"4,Pizza,07.66",
			"5,Burger,05.42"
	};
	
	public FoodItem() {
		readStringArray();
	}

	public void readStringArray() {
		FileUtil<FoodItem> util = new FileUtil<FoodItem>(FoodItem.class);
		util.writeCSV(csvString);	
		for(String str : csvString) {
			new FoodItem(str);
		}
	}
	
	public FoodItem(int id, String name, double price) {
		super(id, name, price);
	}
	
	public FoodItem(String csvString) {
		String[] fields = csvString.split(",");
		int id = Integer.parseInt(fields[0]);
		String name = fields[1];
		double price = Double.parseDouble(fields[2]);
		Store.itemList.add(new FoodItem(id, name, price));
	}


	@Override
	public String toString() {
		return "FoodItem [getId()=" + getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

	
}
