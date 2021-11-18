package edu.neu.csye6200;

public class ElectronicItem extends Item {
	
	private static String[] csvString = {	
			"10,Laptop,1180", 
			"20,Trimmer,370",
			"30,Mobile,460",
			"40,Adapter,17.6",
			"50,Speaker,35.42"
	};
	
	public ElectronicItem(int id, String name, double price) {
		super(id, name, price);
	}

	public ElectronicItem() {
		this(csvString);
	}
	
	public ElectronicItem(String[] csvString) {
		super();
		FileUtil<ElectronicItem> util = new FileUtil<ElectronicItem>(ElectronicItem.class);
		String fileName = util.writeCSV(csvString);
		
		Store.itemList.addAll(util.readCSV(fileName));
	}

	@Override
	public String toString() {
		return "ElectronicItem [getId()=" + getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}
}
