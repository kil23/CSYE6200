package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil<T> {
	
	 private T t;

	 public void set(T t) { this.t = t; }
	 public T get() { return t; }
	
	public List<T> readCSV(String fileName) {
		
		List<T> list = new ArrayList<T>();
		try (BufferedReader inLine = new BufferedReader(new FileReader(fileName))) {
			String inputLine = null;// read one line from file at a time
			while ((inputLine = inLine.readLine()) != null) {
				String[] fields = inputLine.split(",");
				int id = Integer.parseInt(fields[0]);
				String fname = fields[1];
				String lname = fields[2];
				int age = Integer.parseInt(fields[3]);
				String parentFname = fields[4];
				String parentLname = fields[5];
				if(t instanceof Student) {
					int studentId = Integer.parseInt(fields[6]);
					double gpa = Double.parseDouble(fields[7]);
					list.add((T) new Student(id, fname, lname, age, parentFname, parentLname, studentId, gpa));
				}else {
					double hourlyWage = Double.parseDouble(fields[6]);
					list.add((T) new Teacher(id, fname, lname, age, parentFname, parentLname, hourlyWage));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return list;
	}
	
	public String writeCSV(String[] csvString) {
		String fileName = null;
		if(t instanceof Student) {
			fileName = "student.txt";
		}else {
			fileName = "teacher.txt";
		}
		try (FileWriter fw = new FileWriter(fileName); BufferedWriter out= new BufferedWriter(fw);) {
			System.out.println("BufferedWriter: '" + fileName + "', write " + csvString.length + " items");
			for (String name : csvString) {
				out.write(name);
				out.newLine();
			}
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileName;
	}
}
