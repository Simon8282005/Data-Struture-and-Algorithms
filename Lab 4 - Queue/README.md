# 🧩 Task 1: Apply and Test the Implementation of Queue Using Array

## 🎯 Objective
In this task, you will:
- Apply the **basic implementation of a Queue** using arrays.  
- Test and analyze the fundamental queue operations such as **enqueue**, **dequeue**, and **peek**.

🕒 **Estimated Time:** 60 Minutes

---

## 📖 Definition of Queue
A **queue** is a linear data structure that follows the **FIFO (First-In, First-Out)** principle.  
This means that the first element inserted into the queue is the first one to be removed.

A common analogy is a **line of people waiting** for an amusement park ride — new people join the **back of the line**, and people get on the ride from the **front**.

### 🧠 Real-World Applications
- Managing print jobs in a **printer spooler**
- Handling **network requests** on a web server
- **Customer service systems** (calls or tickets)
- **Scheduling processes** in an operating system

---

## ⚙️ Basic Operations in a Queue

| Operation | Description |
|------------|-------------|
| **Enqueue** | Adds an element to the **back** of the queue |
| **Dequeue** | Removes an element from the **front** of the queue |
| **Peek** | Views the **front** element without removing it |

**Example Flow:**

1. Enqueue → Insert element to the rear  
2. Dequeue → Remove element from the front  
3. Peek → Check what’s currently at the front  

## 💻 Java Code: `CharQueue.java`
```java
package queueexperiment;

/**
 * Linear Queue Implementation
 * @author Simon
 */
public class CharQueue {
    char q[];
    int front, rear, size;

    public CharQueue(int m) {
        size = m;
        q = new char[size];
        front = rear - 1;
    }

    // Enqueue: place item at the back of the queue
    void enqueue(char n) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = rear = 0;
            } else {
                rear++;
            }
            q[rear] = n;
        }
    }

    // Dequeue: retrieve and remove element from the front
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

    // Peek: retrieve element at the front without removing
    char peek() {
        return q[front];
    }

    // Display all elements in the queue
    void displayAllElements(int size) {
        System.out.println("Elements in queue: ");
        for (int i = 0; i < size; i++) {
            System.out.println(q[i]);
        }
    }

    boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    boolean isFull() {
        return (rear == size - 1);
    }
}
```
## Key Learning Point Task 1
- Queue follows FIFO principle.

- `enqueue()` adds data at the rear, `dequeue()` removes from the front.

- Linear queues are easy to implement but waste space once elements are removed.

- Proper boundary checking (full/empty) is crucial to prevent runtime errors.

- This implementation will be improved using a circular queue in later tasks.

# 🧩 Task 2: Observing the Limitation of a Linear Queue

## 📖 Concept Overview

In a **linear queue**, the `front` pointer moves forward when elements are dequeued.  
However, the removed elements’ memory locations are **not reused** — even though they become empty.

As a result, the queue can appear **full** even when there are free slots at the beginning of the array.  
This happens because the **rear pointer** keeps moving forward without looping back.

## 🧪 Experiment Steps

1. Open the **QueueExperiment** project created in Task 1.  
2. Use the same `CharQueue` class from before.  
3. In the main method, modify your code as shown below to observe the limitation.  
4. Compile and run the code.  
5. Analyze the result.

## 💻 Java Code: `QueueExperiment.java`
```java
package queueexperiment;

/**
 * Observing Linear Queue Limitation
 * @author Simon
 * Name : Chong Yu
 * Program: Software Engineering
 * Course : CSF3013
 * Lab : MP1
 * Date : 10/11/2025
 */
public class QueueExperiment {
    public static void main(String[] args) {
        CharQueue myQueue = new CharQueue(10);

        // Enqueue elements
        myQueue.enqueue('a');
        myQueue.enqueue('b');
        myQueue.enqueue('c');
        myQueue.enqueue('d');

        // Dequeue two elements
        myQueue.dequeue();
        myQueue.dequeue();

        // Enqueue more elements
        myQueue.enqueue('e');
        myQueue.enqueue('f');
        myQueue.enqueue('g');
        myQueue.enqueue('h');
        myQueue.enqueue('i');
        myQueue.enqueue('j');
        myQueue.enqueue('k');
        myQueue.enqueue('1');

        // Display queue contents
        myQueue.displayAllElements(10);
    }
}
```

## Key Learning Point Task 2

- Linear queues cannot reuse memory after dequeue operations.

- The queue’s `front` and `rear` pointers only move forward.

- When the `rear` pointer reaches the end, no new data can be inserted — even if the queue has empty slots at the `front`.

- This problem leads to queue overflow and inefficient memory usage.

- To fix this, we use a Circular Queue, which wraps around and reuses the available space.

# 🧩 Task 3: Implementation of Circular Queue

## 📖 Definition of Circular Queue
A **Circular Queue** is a linear data structure that connects the **end of the queue** back to the **front**, forming a logical circle.

It solves the problem of wasted space in a linear queue by **reusing** the empty positions after dequeue operations.

In a circular queue:
- The **rear pointer** wraps back to the start when it reaches the end.
- The **front pointer** moves cyclically as elements are dequeued.

---

## 🧠 Why Use Circular Queue?

| Linear Queue | Circular Queue |
|---------------|----------------|
| Wastes space after dequeuing | Efficiently reuses freed space |
| Rear stops at array end | Rear wraps around to the beginning |
| Inefficient for continuous enqueue/dequeue | Perfect for cyclic or repeated use |


## 💡 Real-World Applications
- **Round-robin scheduling** in operating systems  
- **Multiplayer turn-based games** (players take turns in cycles)  
- **Buffer management** in streaming and networking  
- **Task scheduling** in real-time systems  

## ⚙️ Basic Operations in Circular Queue

| Operation | Description |
|------------|-------------|
| **Enqueue** | Adds an element at the rear. If the rear reaches the end, it wraps back to index `0`. |
| **Dequeue** | Removes an element from the front. If the front reaches the end, it wraps to `0`. |
| **isFull()** | Returns `true` when all positions are filled. |
| **isEmpty()** | Returns `true` when there are no elements in the queue. |
| **toString()** | Displays the queue contents neatly. |

---

## 🧩 Implementation Steps
1. In your existing **QueueExperiment** project, create a new file named `CircularQueue.java`.  
2. Implement the **CircularQueue** class using **generics** (`<E>`).  
3. Create **custom exception classes** to handle empty and full queue scenarios.  
4. Write a **main class** to test the circular queue implementation.  
5. Modify the test to use **String data** instead of integers.

---

## 💻 Java Code: `CircularQueue.java`
```java
package queueexperiment;

import java.util.Arrays;

public class CircularQueue<E> {
    private int currentSize;               // Current queue size
    private E[] circularQueueElements;     // Array to store elements
    private int maxSize;                   // Max capacity
    private int rear;                      // Rear pointer
    private int front;                     // Front pointer

    // Constructor
    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        circularQueueElements = (E[]) new Object[this.maxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }

    // Enqueue: Add element to the rear
    public void enqueue(E item) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException("Circular queue is full. Element cannot be added.");
        } else {
            rear = (rear + 1) % circularQueueElements.length;
            circularQueueElements[rear] = item;
            currentSize++;
            if (front == -1) {
                front = rear;
            }
        }
    }

    // Dequeue: Remove element from the front
    public E dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Circular queue is empty. Element cannot be retrieved");
        } else {
            E deQueueElement = circularQueueElements[front];
            circularQueueElements[front] = null;
            front = (front + 1) % circularQueueElements.length;
            currentSize--;
            return deQueueElement;
        }
    }

    // Check if queue is full
    public boolean isFull() {
        return (currentSize == circularQueueElements.length);
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    @Override
    public String toString() {
        return "CircularQueue " + Arrays.toString(circularQueueElements);
    }
}

// Exception: Queue is full
class QueueFullException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public QueueFullException() {
        super();
    }

    public QueueFullException(String message) {
        super(message);
    }
}

// Exception: Queue is empty
class QueueEmptyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }
}
```
### Example Output
```java
Initial Queue: CircularQueue [Iltizam, tekad, rajin, usaha, berjaya, konsisten, yakin, tabah]
After operations: CircularQueue [kuat, tekad, rajin, usaha, berjaya, konsisten, yakin, tabah]
```

### Key Learning Point Task 3
- A Circular Queue efficiently reuses memory spaces.

- It resolves the queue overflow issue of linear queues.

- The front and rear pointers wrap around using modulo (%) operations.

- Generics allow the queue to handle any data type (e.g., String, Integer).

- Exception handling ensures robust code execution.
