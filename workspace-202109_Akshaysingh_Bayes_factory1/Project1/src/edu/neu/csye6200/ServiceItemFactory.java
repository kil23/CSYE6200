package edu.neu.csye6200;

public class ServiceItemFactory implements ItemFactory {
	
	private static final ServiceItemFactory item = new ServiceItemFactory();
	
	private ServiceItemFactory() {
		
	}
	
	public static ServiceItemFactory getInstance() {
		return item;
	}

	@Override
	public Item getObject() {
		return new ServiceItem();
	}
}
