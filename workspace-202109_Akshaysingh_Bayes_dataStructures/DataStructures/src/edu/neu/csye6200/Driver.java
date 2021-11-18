package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		System.out.println("\n************************ QUEUE IMPLEMENTATION ************************\n");
		Queue.demo();
		GenericQueue.demo();
		System.out.println("\n************************ STACK IMPLEMENTATION ************************\n");
		Stack.demo();
		GenericStack.demo();
	}
}


/**
 * 
 * OUTPUT
 * 
 * 
************************ QUEUE IMPLEMENTATION ************************

Queue Implementation for primitive int: 
Adding 1
Adding 2
Adding 3
The front element is 1
Removing 1
The front element is 2
The queue size is 2
Removing 2
Removing 3
The queue is empty

======================================================================

(Generic) String Queue Implementation of capacity : 4
Adding element to Queue :  Eat
Adding element to Queue :  Sleep
Adding element to Queue :  Rave
Adding element to Queue :  Repeat
The front element is Eat
Total elements in Queue : 4
Removing front element from Queue : Eat
Removing front element from Queue : Sleep
Removing front element from Queue : Rave
Removing front element from Queue : Repeat
The queue is empty? true

======================================================================

(Generic) Double Queue Implementation with capacity : 3
Adding element to Queue :  2.3
Adding element to Queue :  3.78
Adding element to Queue :  1.85
The front element is 2.3
Total elements in Queue : 3
Removing front element from Queue : 2.3
Removing front element from Queue : 3.78
The queue is empty? false
Removing front element from Queue : 1.85
The queue is empty? true
Queue is empty. No Element to remove.

======================================================================

(Generic) Integer Queue Implementation with capacity : 16
Adding element to Queue :  2
Adding element to Queue :  3
Adding element to Queue :  1
Adding element to Queue :  7
Adding element to Queue :  8
The front element is 2
Total elements in Queue : 5
Removing front element from Queue : 2
Removing front element from Queue : 3
Removing front element from Queue : 1
Removing front element from Queue : 7
Removing front element from Queue : 8
Queue is empty. No Element to remove.

************************ STACK IMPLEMENTATION ************************

Stack Implementation for primitive int : 
Adding elements to Stack : 1
Adding elements to Stack : 2
Removing element from Stack : 2
Removing element from Stack : 1
Adding elements to Stack : 3
The top element is 3
The stack size is 1
Removing element from Stack : 3
The stack is empty

======================================================================

(Generic) String Stack Implementation of capacity : 3
Adding elements to Stack : Alpha
Adding elements to Stack : Beta
Removing element from Stack : Beta
Removing element from Stack : Alpha
Adding elements to Stack : Gamma
The top element is Gamma
The stack size is 1
Removing element from Stack : Gamma
The stack is empty? true

======================================================================

(Generic) Double Stack Implementation of capacity : 4
Adding elements to Stack : 1.0
Adding elements to Stack : 2.0
Adding elements to Stack : 3.0
Adding elements to Stack : 4.0
Removing element from Stack : 4.0
Removing element from Stack : 3.0
Adding elements to Stack : 3.0
The top element is 3.0
The stack size is 3
Removing element from Stack : 3.0
Removing element from Stack : 2.0
The stack is empty? false

======================================================================

(Generic) Integer Stack Implementation of capacity : 16
Adding elements to Stack : 1
Adding elements to Stack : 2
Adding elements to Stack : 3
Adding elements to Stack : 4
Adding elements to Stack : 5
Adding elements to Stack : 6
Removing element from Stack : 6
Removing element from Stack : 5
Adding elements to Stack : 3
The top element is 3
The stack size is 5
Removing element from Stack : 3
Removing element from Stack : 4
Removing element from Stack : 3
Removing element from Stack : 2
Removing element from Stack : 1
The stack is empty? true
Stack is empty. No Element to pop.

*/
