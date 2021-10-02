package edu.neu.csye6200;

public class AnimalAPI {
	
	private String message = "I am an animalAPI... toString()";

	public AnimalAPI() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return getMessage();
	}

	public void speak() {
		System.out.println(getMessage());
	}

}
