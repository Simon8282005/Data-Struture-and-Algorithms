# 🧮 Lab 4 – Queue

**Course:** Data Structure & Algorithm  
**Student:** Chong Yu (S76136)  
**Group:** K3  
**Lab:** MP1  
**Date:** 10/11/2025  
**Institution:** Universiti Malaysia Terengganu (UMT)

---

## 📘 Table of Contents
1. [Introduction](#introduction)  
2. [Task 1 – Linear Queue using Array](#task-1--linear-queue-using-array)  
3. [Task 2 – Limitation of Linear Queue](#task-2--limitation-of-linear-queue)  
4. [Task 3 – Circular Queue Implementation](#task-3--circular-queue-implementation)  
5. [Key Concepts Recap](#key-concepts-recap)

---

## 🧩 Introduction
A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle — the first element inserted is the first one removed.  
Common real-world analogies: waiting lines, print jobs, or customer service calls.

### Typical Queue Operations
| Operation | Description |
|------------|-------------|
| `enqueue()` | Adds an element at the **rear** of the queue. |
| `dequeue()` | Removes an element from the **front** of the queue. |
| `peek()` | Returns the front element **without removing** it. |

---

## 🧠 Task 1 – Linear Queue using Array

### 🎯 Objective
Implement and test a basic **queue** using a **static array**.

### 🧱 Key Points
- Uses a **fixed-size array** for storage.
- Elements are added at `rear` and removed from `front`.
- When `dequeue()` is called, the `front` pointer moves forward — older elements remain in memory but are not visible.
- May require **shifting elements** to reuse space.

### ⚙️ Implementation Highlights
```java
class CharQueue {
    char[] q;
    int front, rear, size;

    public CharQueue(int m) {
        size = m;
        q = new char[size];
        front = -1;
        rear = -1;
    }

    void enqueue(char n) { ... }
    char dequeue() { ... }
    char peek() { ... }
    void displayAllElements(int size) { ... }
    boolean isEmpty() { ... }
    boolean isFull() { ... }
}
