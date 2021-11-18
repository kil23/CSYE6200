package edu.neu.csye6200;

import java.util.Arrays;
import java.util.Comparator;

public class Student extends Person{
	
	private double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(int id, int age, String name, double gpa) {
		super(id, age, name);
		this.gpa = gpa;
	}
	
	public void demo() {
		
		String[] names = {"ab", "cd", "ef"};
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);// lexicographic order
			}  
		}); 
	}
}
