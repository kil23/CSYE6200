package edu.neu.csye6200;

import java.util.NoSuchElementException;

public interface StackInterface<E> {
    /**
     * Utility function to add an element `x` to the stack
     * 
     * @param element - A generic element to add to the stack
     * @return StackInterface to allow method chaining.
     */
    StackInterface<E> push(E element);

    /**
     * Utility function to pop a top element from the stack
     * 
     * @return The first element in the stack
     * @throws NoSuchElementException
     *             When there are no elements in the stack
     */
    E pop() throws NoSuchElementException;

    /**
     * @return the first element in the stack. Returns null if the stack is empty.
     */
    E peek();
    
    // Utility function to return the size of the queue
    public int size();
 
    // Utility function to check if the queue is empty or not
    public Boolean isEmpty();
 
    // Utility function to check if the queue is full or not
    public Boolean isFull();
}
