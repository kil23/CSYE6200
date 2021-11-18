package edu.neu.csye6200;

public interface ItemFactory {
	
	public <T extends Item> T getObject();
	
}
