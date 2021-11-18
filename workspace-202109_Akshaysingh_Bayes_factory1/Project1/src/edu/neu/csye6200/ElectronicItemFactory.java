package edu.neu.csye6200;

public class ElectronicItemFactory implements ItemFactory{
	
	private static ElectronicItemFactory item;
	
	private ElectronicItemFactory() {
		
	}
	
	@Override
	public Item getObject() {
		return new ElectronicItem();
	}
	
	public static ElectronicItemFactory getInstance() {
		if(item == null)  
			item = new ElectronicItemFactory();
		return item;
	}

}
