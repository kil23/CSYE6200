package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil<T> {
	
	final Class<T> t;
	 
	 FileUtil(Class<T> c) { 
		 t = c;
	 }
	
	public List<Item> readCSV(String fileName) {
		
		List<Item> list = new ArrayList<Item>();
		try (BufferedReader inLine = new BufferedReader(new FileReader(fileName))) {
			String inputLine = null;
			while ((inputLine = inLine.readLine()) != null) {
				String[] fields = inputLine.split(",");
				int id = Integer.parseInt(fields[0]);
				String name = fields[1];
				double price = Double.parseDouble(fields[2]);
				if(t.isAssignableFrom(FoodItem.class)) {
					list.add(new FoodItem(id, name, price));
				}else if(t.isAssignableFrom(ElectronicItem.class)) {
					list.add(new ElectronicItem(id, name, price));
				}else if(t.isAssignableFrom(ServiceItem.class)){
					list.add(new ServiceItem(id, name, price));
				}
			}
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}	
		return list;
	}
	
	public String writeCSV(String[] csvString) {
		String fileName = null;
		if(t.isAssignableFrom(FoodItem.class)) {
			fileName = "FoodItemCSV.txt";
		} else if(t.isAssignableFrom(ElectronicItem.class)) {
			fileName = "ElectronicItemCSV.txt";
		} else if(t.isAssignableFrom(ServiceItem.class)){
			fileName = "ServiceItemCSV.txt";
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
