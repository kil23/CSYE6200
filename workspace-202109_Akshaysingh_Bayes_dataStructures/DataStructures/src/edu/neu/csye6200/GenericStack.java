package edu.neu.csye6200;

import java.util.NoSuchElementException;

public class GenericStack<T> implements StackInterface<T>{

	private T arr[];
    private int top;
    private int capacity;
    
    public final static int DEFAULT_INITIAL_ARRAY_SIZE = 16;
    /**
     * MAX_ARRAY_SIZE is set to Integer.MAX_VALUE - 8 to prevent OutOfMemoryErrors.
     */
    public static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
    
    public GenericStack() {
        this(DEFAULT_INITIAL_ARRAY_SIZE);
    }
    
 // Constructor to initialize the stack
    public GenericStack(int capacity) {
    	if (capacity < 1) {
            throw new IllegalArgumentException("Queue capacity must be 1 or greater");
        }

        if (capacity > MAX_ARRAY_SIZE) {
            throw new IllegalArgumentException("Stack capacity is greater then maximum array size");
        }

        // Data variable is private so it will never be returned to the client
        // and the only method that can push elements onto the array would have to be the same type so it is OK
        // to suppress the warning message.
        @SuppressWarnings("unchecked")
        T[] tempData = (T[]) new Object[capacity];
        arr = tempData;
        this.capacity = capacity;
        this.top = -1;
    }
 
    
	@Override
	public StackInterface<T> push(T element) {
		if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }
 
        System.out.println("Adding elements to Stack : " + element);
        arr[++top] = element;
        return this;
	}

	@Override
	public T pop() throws NoSuchElementException {
		 // check for stack underflow
        if (isEmpty()) {
        	throw new NoSuchElementException("Queue does not contain any items.");
        }
 
        System.out.println("Removing element from Stack : " + peek());
 
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
	}

	@Override
	public T peek() {
		if (isEmpty()) {
        	System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
 
        return arr[top];
	}

	@Override
	public int size() {
		 return top + 1;
	}

	@Override
	public Boolean isEmpty() {
		 return top == -1;               // or return size() == 0;
	}

	@Override
	public Boolean isFull() {
		 return top == capacity - 1;     // or return size() == capacity;
	}
	
	public static void demo() {
    	GenericStack<String> stringStack = new GenericStack<>(3);
    	System.out.println("\n======================================================================\n");
    	System.out.println("(Generic) String Stack Implementation of capacity : " + stringStack.capacity);
    	stringStack.push("Alpha");      // inserting 1 in the stack
    	stringStack.push("Beta");      // inserting 2 in the stack
 
    	stringStack.pop();        // removing the top element (2)
    	stringStack.pop();        // removing the top element (1)
    	
    	stringStack.push("Gamma");      // inserting 3 in the stack
 
        System.out.println("The top element is " + stringStack.peek());
        System.out.println("The stack size is " + stringStack.size());
 
        stringStack.pop();        // removing the top element (3)
 
        // check if the stack is empty
    	System.out.println("The stack is empty? "+ stringStack.isEmpty());
    	
    	GenericStack<Double> doubleStack = new GenericStack<>(4);
    	System.out.println("\n======================================================================\n");
    	System.out.println("(Generic) Double Stack Implementation of capacity : " + doubleStack.capacity);
    	doubleStack.push(1.0);      // inserting 1 in the stack
    	doubleStack.push(2.0);      // inserting 2 in the stack
    	doubleStack.push(3.0);      // inserting 3 in the stack
    	doubleStack.push(4.0);      // inserting 4 in the stack
 
    	doubleStack.pop();        // removing the top element (2)
    	doubleStack.pop();        // removing the top element (1)
    	
    	doubleStack.push(3.0);      // inserting 3 in the stack
 
        System.out.println("The top element is " + doubleStack.peek());
        System.out.println("The stack size is " + doubleStack.size());
 
        doubleStack.pop();        // removing the top element (3)
        doubleStack.pop();		  // removing the top element (4)
 
        // check if the stack is empty
    	System.out.println("The stack is empty? "+ doubleStack.isEmpty());
    	
    	GenericStack<Integer> integerStack = new GenericStack<>();
    	System.out.println("\n======================================================================\n");
    	System.out.println("(Generic) Integer Stack Implementation of capacity : " + integerStack.capacity);
    	integerStack.push(1);      // inserting 1 in the stack
    	integerStack.push(2);      // inserting 2 in the stack
    	integerStack.push(3);      // inserting 3 in the stack
    	integerStack.push(4);      // inserting 4 in the stack
    	integerStack.push(5);      // inserting 5 in the stack
    	integerStack.push(6);      // inserting 6 in the stack
 
    	integerStack.pop();        // removing the top element (6)
    	integerStack.pop();        // removing the top element (5)
    	
    	integerStack.push(3);      // inserting 3 in the stack
 
        System.out.println("The top element is " + integerStack.peek());
        System.out.println("The stack size is " + integerStack.size());
 
        integerStack.pop();        // removing the top element (3)
        integerStack.pop();        // removing the top element (4)
        integerStack.pop();        // removing the top element (3)
        integerStack.pop();        // removing the top element (2)
        integerStack.pop();        // removing the top element (1)
 
        // check if the stack is empty
    	System.out.println("The stack is empty? "+ integerStack.isEmpty());
    	
    	try {
        	integerStack.pop();
    	}catch(NoSuchElementException e) {
    		System.out.println("Stack is empty. No Element to pop.");
    	}

    }

}
