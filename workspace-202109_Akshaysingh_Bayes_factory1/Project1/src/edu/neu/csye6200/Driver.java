package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		
		Store.demo();
		
	}

}


/*
 * 
 * OUTPUT
 * 
 * 
 *BufferedWriter: 'ServiceItemCSV.txt', write 5 items
BufferedWriter: 'FoodItemCSV.txt', write 5 items
BufferedWriter: 'ElectronicItemCSV.txt', write 5 items

Item list size : 15

ServiceItem [getId()=11, getName()=Laundry, getPrice()=6.8]
ServiceItem [getId()=22, getName()=Electra, getPrice()=33.7]
ServiceItem [getId()=33, getName()=Gas, getPrice()=41.6]
ServiceItem [getId()=44, getName()=WiFi, getPrice()=75.66]
ServiceItem [getId()=55, getName()=Rental, getPrice()=25.42]
FoodItem [getId()=1, getName()=Cake, getPrice()=11.8]
FoodItem [getId()=2, getName()=Bread, getPrice()=3.7]
FoodItem [getId()=3, getName()=Milk, getPrice()=4.6]
FoodItem [getId()=4, getName()=Pizza, getPrice()=7.66]
FoodItem [getId()=5, getName()=Burger, getPrice()=5.42]
ElectronicItem [getId()=10, getName()=Laptop, getPrice()=1180.0]
ElectronicItem [getId()=20, getName()=Trimmer, getPrice()=370.0]
ElectronicItem [getId()=30, getName()=Mobile, getPrice()=460.0]
ElectronicItem [getId()=40, getName()=Adapter, getPrice()=17.6]
ElectronicItem [getId()=50, getName()=Speaker, getPrice()=35.42]

15 food-items in the following collection: 
======================================================================================
1. SORTING BY NAME.
--------------------------------------------------------------------------------------
	ID	|	NAME	|	PRICE	|
--------------------------------------------------------------------------------------
	40	|	Adapter	|	17.6	|	
	2	|	Bread	|	3.7		|	
	5	|	Burger	|	5.42	|	
	1	|	Cake	|	11.8	|	
	22	|	Electra	|	33.7	|	
	33	|	Gas		|	41.6	|	
	10	|	Laptop	|	1180.0	|	
	11	|	Laundry	|	6.8		|	
	3	|	Milk	|	4.6		|	
	30	|	Mobile	|	460.0	|	
	4	|	Pizza	|	7.66	|	
	55	|	Rental	|	25.42	|	
	50	|	Speaker	|	35.42	|	
	20	|	Trimmer	|	370.0	|	
	44	|	WiFi	|	75.66	|	

--------------------------------------------------------------------------------------
2. SORTING BY PRICE
--------------------------------------------------------------------------------------
	ID	|	NAME	|	PRICE	|
--------------------------------------------------------------------------------------
	2	|	Bread	|	3.7		|	
	3	|	Milk	|	4.6		|
	5	|	Burger	|	5.42	|	
	11	|	Laundry	|	6.8		|	
	4	|	Pizza	|	7.66	|	
	1	|	Cake	|	11.8	|	
	40	|	Adapter	|	17.6	|	
	55	|	Rental	|	25.42	|	
	22	|	Electra	|	33.7	|	
	50	|	Speaker	|	35.42	|	
	33	|	Gas		|	41.6	|	
	44	|	WiFi	|	75.66	|	
	20	|	Trimmer	|	370.0	|	
	30	|	Mobile	|	460.0	|	
	10	|	Laptop	|	1180.0	|	

--------------------------------------------------------------------------------------
4. SORTING BY ID.
--------------------------------------------------------------------------------------
	ID	|	NAME	|	PRICE	|
--------------------------------------------------------------------------------------
	1	|	Cake	|	11.8	|	
	2	|	Bread	|	3.7		|	
	3	|	Milk	|	4.6		|	
	4	|	Pizza	|	7.66	|	
	5	|	Burger	|	5.42	|	
	10	|	Laptop	|	1180.0	|	
	11	|	Laundry	|	6.8		|	
	20	|	Trimmer	|	370.0	|	
	22	|	Electra	|	33.7	|	
	30	|	Mobile	|	460.0	|	
	33	|	Gas		|	41.6	|	
	40	|	Adapter	|	17.6	|	
	44	|	WiFi	|	75.66	|	
	50	|	Speaker	|	35.42	|	
	55	|	Rental	|	25.42	|	

--------------------------------------------------------------------------------------
BufferedWriter: 'ElectronicItemCSV.txt', write 5 items
BufferedWriter: 'ServiceItemCSV.txt', write 5 items

Singleton Item list size : 25

	ID	|	NAME	|	PRICE	|
--------------------------------------------------------------------------------------
	1	|	Cake	|	11.8	|	
	2	|	Bread	|	3.7		|	
	3	|	Milk	|	4.6		|	
	4	|	Pizza	|	7.66	|	
	5	|	Burger	|	5.42	|	
	10	|	Laptop	|	1180.0	|	
	11	|	Laundry	|	6.8		|	
	20	|	Trimmer	|	370.0	|	
	22	|	Electra	|	33.7	|	
	30	|	Mobile	|	460.0	|	
	33	|	Gas		|	41.6	|	
	40	|	Adapter	|	17.6	|	
	44	|	WiFi	|	75.66	|	
	50	|	Speaker	|	35.42	|	
	55	|	Rental	|	25.42	|	
	10	|	Laptop	|	1180.0	|	
	20	|	Trimmer	|	370.0	|	
	30	|	Mobile	|	460.0	|	
	40	|	Adapter	|	17.6	|	
	50	|	Speaker	|	35.42	|	
	11	|	Laundry	|	6.8		|	
	22	|	Electra	|	33.7	|	
	33	|	Gas		|	41.6	|	
	44	|	WiFi	|	75.66	|	
	55	|	Rental	|	25.42	|	
*/