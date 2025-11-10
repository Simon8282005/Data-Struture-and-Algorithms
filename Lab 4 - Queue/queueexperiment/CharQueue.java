/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueexperiment;

/**
 *
 * @author MP2-4
 */
public class CharQueue {
    char q[];
    int front, rear, size;
    
    public CharQueue(int m) {
        size = m;
        q = new char[size];
        front = rear - 1;
    }
    
    // Place item at the back of the queue
    void enqueue(char n) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else {
                rear ++;
            }
            q[rear] = n;
        }
    }
    
    // Retrieve the element at the fron of the queue and remoce it from
    // the queue
    // The queue just adjust the position of the front pointer
    // the the element still exists in the memory
    char dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (char) 250;
        } else {
            char x = q[front];
            front++;
            return x;
        }
    }
    
    // Retrieve the elemtn at the front of the queue without removing it from
    // the queue
    char peek() {
        return q[front];
    }
    
    // Display all element in queue
    void displayAllElements() {
        System.out.println("Elements in queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(q[i]);
        }
    }
    
    // Or another method for display all the queue
    void displayAllElements2() {
        System.out.println("Elements in queue: ");
        for (int i = 0; i < size; i++) {
            if(i == 0) { dequeue(); }
            else {
                System.out.println(q[i]);
            }
        }
    }
    
    boolean isEmpty() {
        return (front == -1 || front > rear);
    }
    
    boolean isFull() {
        return (rear == size - 1);
    }
}
