package edu.neu.csye6200;

public class TwoAlternatingThreads{
	
	public static void alternatingAlphabets() {
		AlternatingAlphabet alternatingAlphabet = new AlternatingAlphabet(false);

        Thread t1 = new Thread(new Runnable() {
          @Override
          public void run() {

              try {

            	  alternatingAlphabet.lowercaseAlphabet();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        });


        Thread t2 = new Thread(new Runnable() {	
          @Override
          public void run() {
              try {
            	  alternatingAlphabet.uppercaseAlphabet();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }

          }
        });
		System.out.println("\n***** Alternating Alphabet *****");
        t1.start();
        t2.start();
	}
	
	public static void thread1Operations() {
		Thread t1 = new Thread(new Runnable() {

	          @Override
	          public void run() {
	        	  System.out.println("\n***** Thread t1 *****");
	        	  lowercaseAlpha();
	        	  uppercaseAlpha();
	          }
	    });
		t1.start();
	}
	
	public static void thread2Operations() {
		Thread t2 = new Thread(new Runnable() {

	          @Override
	          public void run() {
	        	  System.out.println("\n***** Thread t2 *****");
	        	  lowercaseAlpha();
	        	  uppercaseAlpha();
	          }
	    });
		t2.start();
	}
	
	public static void lowercaseAlpha() {
		System.out.print("lowercase : ");

		for(char i = 'a'; i <= 'z'; i++) {
		     System.out.print(i);
		}
	}
	
	public static void uppercaseAlpha() {
		System.out.print("\nuppercase : ");

		for(char i = 'A'; i <= 'Z'; i++) {
		     System.out.print(i);
		}
	}
	
	public static void demo() {	
		lowercaseAlpha();
		uppercaseAlpha();
		
		thread1Operations();
		thread2Operations();
		
		alternatingAlphabets();
		
	}
}


/*
 * 
 * OUTPUT : 
 * 
 * 

============================================ Multithreading Output ===========================================

lowercase : abcdefghijklmnopqrstuvwxyz
uppercase : ABCDEFGHIJKLMNOPQRSTUVWXYZ
***** Thread t1 *****
lowercase : abcdefghijklmnopqrstuvwxyz
uppercase : ABCDEFGHIJKLMNOPQRSTUVWXYZ
***** Thread t2 *****
lowercase : abcdefghijklmnopqrstuvwxyz
uppercase : ABCDEFGHIJKLMNOPQRSTUVWXYZ
***** Alternating Alphabet *****
aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ

============================================ Weightloss Graph Output ===========================================

Sorting by Person ID (Natural Order) : 
Person [ID = 1, Age = 25, Name = Jim, WeightLbs = 311, WeightLossLbs = 11]
Person [ID = 2, Age = 21, Name = Sam, WeightLbs = 315, WeightLossLbs = 15]
Person [ID = 3, Age = 17, Name = Dan, WeightLbs = 314, WeightLossLbs = 14]
Person [ID = 4, Age = 19, Name = Bob, WeightLbs = 312, WeightLossLbs = 12]
Person [ID = 5, Age = 16, Name = Ann, WeightLbs = 310, WeightLossLbs = 10]
Person [ID = 6, Age = 23, Name = Eve, WeightLbs = 313, WeightLossLbs = 13]

Sorting by Person Age : 
Person [ID = 5, Age = 16, Name = Ann, WeightLbs = 310, WeightLossLbs = 10]
Person [ID = 3, Age = 17, Name = Dan, WeightLbs = 314, WeightLossLbs = 14]
Person [ID = 4, Age = 19, Name = Bob, WeightLbs = 312, WeightLossLbs = 12]
Person [ID = 2, Age = 21, Name = Sam, WeightLbs = 315, WeightLossLbs = 15]
Person [ID = 6, Age = 23, Name = Eve, WeightLbs = 313, WeightLossLbs = 13]
Person [ID = 1, Age = 25, Name = Jim, WeightLbs = 311, WeightLossLbs = 11]

Sorting by Person Name : 
Person [ID = 5, Age = 16, Name = Ann, WeightLbs = 310, WeightLossLbs = 10]
Person [ID = 4, Age = 19, Name = Bob, WeightLbs = 312, WeightLossLbs = 12]
Person [ID = 3, Age = 17, Name = Dan, WeightLbs = 314, WeightLossLbs = 14]
Person [ID = 6, Age = 23, Name = Eve, WeightLbs = 313, WeightLossLbs = 13]
Person [ID = 1, Age = 25, Name = Jim, WeightLbs = 311, WeightLossLbs = 11]
Person [ID = 2, Age = 21, Name = Sam, WeightLbs = 315, WeightLossLbs = 15]

Sorting by Person Weight : 
Person [ID = 5, Age = 16, Name = Ann, WeightLbs = 310, WeightLossLbs = 10]
Person [ID = 1, Age = 25, Name = Jim, WeightLbs = 311, WeightLossLbs = 11]
Person [ID = 4, Age = 19, Name = Bob, WeightLbs = 312, WeightLossLbs = 12]
Person [ID = 6, Age = 23, Name = Eve, WeightLbs = 313, WeightLossLbs = 13]
Person [ID = 3, Age = 17, Name = Dan, WeightLbs = 314, WeightLossLbs = 14]
Person [ID = 2, Age = 21, Name = Sam, WeightLbs = 315, WeightLossLbs = 15]

Sorting by Person Weightloss : 
Person [ID = 5, Age = 16, Name = Ann, WeightLbs = 310, WeightLossLbs = 10]
Person [ID = 1, Age = 25, Name = Jim, WeightLbs = 311, WeightLossLbs = 11]
Person [ID = 4, Age = 19, Name = Bob, WeightLbs = 312, WeightLossLbs = 12]
Person [ID = 6, Age = 23, Name = Eve, WeightLbs = 313, WeightLossLbs = 13]
Person [ID = 3, Age = 17, Name = Dan, WeightLbs = 314, WeightLossLbs = 14]
Person [ID = 2, Age = 21, Name = Sam, WeightLbs = 315, WeightLossLbs = 15]

Plotting graph of weight loss : 

11 ***********
15 ***************
14 **************
12 ************
10 **********
13 *************

Plotting Graph of weight losses sorted in Ascending order

10 **********
11 ***********
12 ************
13 *************
14 **************
15 ***************

Plotting Graph of weight losses sorted in Descending order

15 ***************
14 **************
13 *************
12 ************
11 ***********
10 **********

Plotting Graph of weight losses after 1 month

21 *********************
25 *************************
24 ************************
22 **********************
20 ********************
23 ***********************

Plotting Graph of weight losses after 1 month sorted in Ascending order

20 ********************
21 *********************
22 **********************
23 ***********************
24 ************************
25 *************************

Plotting Graph of weight losses after 1 month sorted in Descending order

25 *************************
24 ************************
23 ***********************
22 **********************
21 *********************
20 ********************

Plotting Graph of weight losses after 12 month

210 ******************************************************************************************************************************************************************************************************************
250 **********************************************************************************************************************************************************************************************************************************************************
240 ************************************************************************************************************************************************************************************************************************************************
220 ****************************************************************************************************************************************************************************************************************************
200 ********************************************************************************************************************************************************************************************************
230 **************************************************************************************************************************************************************************************************************************************

Plotting Graph of weight losses after 12 months sorted in Ascending order

200 ********************************************************************************************************************************************************************************************************
210 ******************************************************************************************************************************************************************************************************************
220 ****************************************************************************************************************************************************************************************************************************
230 **************************************************************************************************************************************************************************************************************************************
240 ************************************************************************************************************************************************************************************************************************************************
250 **********************************************************************************************************************************************************************************************************************************************************

Plotting Graph of weight losses after 12 months sorted in Descending order

250 **********************************************************************************************************************************************************************************************************************************************************
240 ************************************************************************************************************************************************************************************************************************************************
230 **************************************************************************************************************************************************************************************************************************************
220 ****************************************************************************************************************************************************************************************************************************
210 ******************************************************************************************************************************************************************************************************************
200 ********************************************************************************************************************************************************************************************************
*/
