package edu.neu.csye6200;

import java.util.NoSuchElementException;

public interface QueueInterface<E> {
    /**
     * Puts an element into the queue and returns this interface to allow method chaining.
     * 
     * @param element
     *            - A generic element to add to the queue
     * @return QueueInterface to allow method chaining.
     */
    QueueInterface<E> enqueue(E element);

    /**
     * Returns the first element, and removes it from the queue. Throws an exception if there are no elements in the queue.
     * 
     * @return The first element in the queue
     * @throws NoSuchElementException
     *             When there are no elements in the queue
     */
    E dequeue() throws NoSuchElementException;

    /**
     * @return the first element in the queue. Returns null if the queue is empty.
     */
    E peek();
    
    // Utility function to return the size of the queue
    public int size();
 
    // Utility function to check if the queue is empty or not
    public Boolean isEmpty();
 
    // Utility function to check if the queue is full or not
    public Boolean isFull();
}
