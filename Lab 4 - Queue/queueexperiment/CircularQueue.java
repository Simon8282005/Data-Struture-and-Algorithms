package queueexperiment;

import java.util.Arrays;

public class CircularQueue <E> {
    private int currentSize;  // Currect Circular Queue Size
    private E[] circularQueueElemenets;
    private int maxSize;  // Cicular queue max size
    
    private int rear;  // rear position of circular queue (new element enqueue at rear)
    private int front;  // front position of circular queue (element will be dequeue from front)
    
    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        circularQueueElemenets = (E[]) new Object[this.maxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }
    
    /*
    Enqueue elements to rear
    */
    public void enqueue(E item) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Circular queue is full. Element cannot be added. ");
        } else {
            rear = (rear + 1) % circularQueueElemenets.length;
            circularQueueElemenets[rear] = item;
            currentSize++;
            
            if (front == -1) {
                front = rear;
            }
        }
    }
    
   /*
    Dequeue element from front
    */
    public E dequeue() throws QueueEmptyException {
        E deQueueElement;
        if (isEmpty()) {
            throw new QueueEmptyException("Circular queue is empty. Element cannot be retrieved");
        } else {
            deQueueElement = circularQueueElemenets[front];
            circularQueueElemenets[front] = null;
            front = (front + 1) % circularQueueElemenets.length;
            currentSize--;
        }
        
        return deQueueElement;
    }
    
    /*
    Check if queue is full
    */
    public boolean isFull() {
        return (currentSize == circularQueueElemenets.length);
    }
    
    /*
    Check if queue is full
    */
    public boolean isEmpty() {
        return (currentSize == 0);
    }
    
    @Override
    public String toString() {
        return "CircularQueue [" + Arrays.toString(circularQueueElemenets) + "]";
    }
}

// Handling the queue is full
class QueueFullException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public QueueFullException() {
        super();
    }
    
    public QueueFullException(String message) {
        super(message);
    }
}

// Handling the queue is empty
class QueueEmptyException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public QueueEmptyException() {
        super();
    }
    
    public QueueEmptyException(String message) {
        super(message);
    }
}
