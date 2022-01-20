package edu.neu.csye6200;

public class AlternatingAlphabet {
	  boolean flag;

	  AlternatingAlphabet(boolean flag) {
	    this.flag = flag;
	  }

	  synchronized void lowercaseAlphabet() throws InterruptedException {

	    for(char i = 'a'; i <= 'z'; i++) {
	      while(flag == true) {
	        wait();
	      }
	      System.out.print(i);
	      notifyAll();
	      flag = true;
	    }
	  }

	  synchronized void uppercaseAlphabet() throws InterruptedException {

	    for(char i = 'A'; i <= 'Z'; i++) {
	      while(flag == false) {
	        wait();
	      }
	      System.out.print(i);
	      notifyAll();
	      flag = false;
	    }
	  }
}
