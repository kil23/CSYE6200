package edu.neu.csye6200;

public class EmployeeFactory implements FactoryInterface {
	
	private static EmployeeFactory factory;
	
	private EmployeeFactory() {
		
	}
	
	public static synchronized EmployeeFactory getInsance() {
		if(factory==null) {
			factory = new EmployeeFactory();
		}
		return factory;
	}
	
	@Override
	public AbstractPersonAPI getObject() {
		return new Employee("8,32,Queen,Lost,33.40");
	}

}
