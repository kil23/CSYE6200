package edu.neu.csye6200;

import java.util.NoSuchElementException;

public class GenericQueue<T> implements QueueInterface<T>{

	private T[] data;
    private int front, size, back, capacity;

    public final static int DEFAULT_INITIAL_ARRAY_SIZE = 16;
    /**
     * MAX_ARRAY_SIZE is set to Integer.MAX_VALUE - 8 to prevent OutOfMemoryErrors.
     */
    public static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public GenericQueue() {
        this(DEFAULT_INITIAL_ARRAY_SIZE);
    }

    public GenericQueue(int capacity) throws IllegalArgumentException {
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
        data = tempData;
        this.capacity = capacity;
    }

    @Override
    public QueueInterface<T> enqueue(T e) throws IllegalArgumentException {
        if (size == data.length) {
            throw new IllegalArgumentException("Ran out of memory to queue");
        }

        data[back] = e;
        back = (back + 1) % capacity;
        size++;
        System.out.println("Adding element to Queue :  " + e);
        return this;
    }

    @Override
    public T dequeue() throws NoSuchElementException {
        if (size == 0) {
            throw new NoSuchElementException("Queue does not contain any items.");
        }

        size--;
    	System.out.println("Removing front element from Queue : " + data[front]);
        T output = data[front];
        data[front] = null;
        front = (front + 1) % capacity;
        return output;
    }

    @Override
    public T peek() {
        return size == 0 ? null : data[front];
    }
    
    @Override
	public int size() {
    	return size;
	}

	@Override
	public Boolean isEmpty() {
		return (size() == 0);
	}

	@Override
	public Boolean isFull() {
		 return (size() == capacity);
	}
    
    public static void demo() {
    	GenericQueue<String> stringQueue = new GenericQueue<>(4);
    	System.out.println("\n======================================================================\n");
    	System.out.println("(Generic) String Queue Implementation of capacity : " + stringQueue.capacity);
    	 
    	stringQueue.enqueue("Eat");
    	stringQueue.enqueue("Sleep");
    	stringQueue.enqueue("Rave");
    	stringQueue.enqueue("Repeat");
    	
    	System.out.println("The front element is " + stringQueue.peek());
    	System.out.println("Total elements in Queue : " + stringQueue.size());
    	
    	stringQueue.dequeue();
    	stringQueue.dequeue();
    	stringQueue.dequeue();
    	stringQueue.dequeue();
  
    	System.out.println("The queue is empty? "+ stringQueue.isEmpty());
    	
    	GenericQueue<Double> doubleQueue = new GenericQueue<>(3);
    	System.out.println("\n======================================================================\n");
    	System.out.println("(Generic) Double Queue Implementation with capacity : " + doubleQueue.capacity);
    	 
    	doubleQueue.enqueue(2.30);
    	doubleQueue.enqueue(3.78);
    	doubleQueue.enqueue(1.85);
    	
    	System.out.println("The front element is " + doubleQueue.peek());
    	System.out.println("Total elements in Queue : " + doubleQueue.size());
    	
    	doubleQueue.dequeue();
    	doubleQueue.dequeue();
    	
    	System.out.println("The queue is empty? "+ doubleQueue.isEmpty());
    	
    	doubleQueue.dequeue();
    	
    	System.out.println("The queue is empty? "+ doubleQueue.isEmpty());
    	
    	try {
        	doubleQueue.dequeue();
    	}catch(NoSuchElementException e) {
    		System.out.println("Queue is empty. No Element to remove.");
    	}
    	
    	GenericQueue<Integer> integerQueue = new GenericQueue<>();
    	System.out.println("\n======================================================================\n");
    	System.out.println("(Generic) Integer Queue Implementation with capacity : " + integerQueue.capacity);
    	
    	integerQueue.enqueue(2);
    	integerQueue.enqueue(3);
    	integerQueue.enqueue(1);
    	integerQueue.enqueue(7);
    	integerQueue.enqueue(8);
    	
    	System.out.println("The front element is " + integerQueue.peek());
    	System.out.println("Total elements in Queue : " + integerQueue.size());
    	
    	integerQueue.dequeue();
    	integerQueue.dequeue();
    	integerQueue.dequeue();
    	integerQueue.dequeue();
    	integerQueue.dequeue();
    	try {
        	integerQueue.dequeue();
    	}catch(NoSuchElementException e) {
    		System.out.println("Queue is empty. No Element to remove.");
    	}
    }
}
