package edu.neu.csye6200;

public class ServiceItem extends Item {
		
	private static String[] csvString = {	
			"11,Laundry,06.80", 
			"22,Electra,33.70",
			"33,Gas,41.60",
			"44,WiFi,75.66",
			"55,Rental,25.42"
	};
	
	ServiceItem() {
		this(csvString);
	}
	
	public ServiceItem(String[] csvString) {
		super();
		FileUtil<ServiceItem> util = new FileUtil<ServiceItem>(ServiceItem.class);
		String fileName = util.writeCSV(csvString);
		
		Store.itemList.addAll(util.readCSV(fileName));
	}
	
	public ServiceItem(int id, String name, double price) {
		super(id, name, price);
	}

	@Override
	public String toString() {
		return "ServiceItem [getId()=" + getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + "]";
	}

	
}
