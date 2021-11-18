package edu.neu.csye6200;

public class StudentFactory implements FactoryInterface {

	private static StudentFactory factory = new StudentFactory();
	
	private StudentFactory() { }
	
	public static synchronized StudentFactory getInstance() {
		return factory;
	}
	
	@Override
	public AbstractPersonAPI getObject() {
		return new Student("3,16,Sam,Brood,3.0");
	}
}
