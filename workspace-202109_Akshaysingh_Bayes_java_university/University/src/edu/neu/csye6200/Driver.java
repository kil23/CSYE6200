package edu.neu.csye6200;

public class Driver {
	
	public static void main(String[] args) {
		NortheasternU.demo();
	}

}

/*
 *
 *OUTPUT: 
 *
 *-------------------Showing student list-------------------
Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15]
Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17]
Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16]

-------------------Showing employee list-------------------
Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37]
Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29]
Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]

-----------------------Showing NorthestrernU Object-----------------------
Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15]
Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17]
Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16]
Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37]
Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29]
Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]

-------------------Sorting student list By Id-------------------
Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15]
Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16]
Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting employee list By Id-------------------
Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37]
Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]
Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting student list By Age-------------------
Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15]
Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16]
Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting employee list By Age-------------------
Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29]
Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]
Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting student list By First Name-------------------
Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15]
Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16]
Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting employee list By First Name-------------------
Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37]
Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]
Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting student list By Last Name-------------------
Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16]
Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17]
Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting employee list By Last Name-------------------
Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29]
Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]
Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting student list By GPA-------------------
Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16]
Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17]
Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-------------------Sorting employee list By Wage-------------------
Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]
Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29]
Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37]

NortheasternU [list=[Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15], Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17], Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16], Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37], Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29], Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]]]

-----------------------Showing NorthestrernU Object-----------------------
Student [Gpa=3.2, Id=2, FirstName=Donald, LastName=Shaw, Age=15]
Student [Gpa=3.1, Id=4, FirstName=Victor, LastName=Champ, Age=17]
Student [Gpa=3.0, Id=3, FirstName=Sam, LastName=Brood, Age=16]
Employee [Wage=40.6, Id=6, FirstName=Emily, LastName=Reid, Age=37]
Employee [Wage=36.2, Id=11, FirstName=Tia, LastName=Garcia, Age=29]
Employee [Wage=33.4, Id=8, FirstName=Queen, LastName=Lost, Age=32]

 *
 */
