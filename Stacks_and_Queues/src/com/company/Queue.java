package com.company;

public class Queue {

    private int[] array;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        this.array = new int[size];
        this.capacity = size;
        front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // Utility function to dequeue the front element
    public void dequeue() {
        // Check for queue underflow
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        int x = array[front];
        System.out.println("Removing " + x);

        front = (front + 1) % capacity;
        count--;

    }

    // Utility function to add an item to the queue
    public void enqueue(int item) {
        // Check for queue overflow
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        array[rear] = item;
        count++;
    }

    public int peek() {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        return array[front];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == this.capacity);
    }

    public static void main(String[] args) {
        //! Queue implementation
        Queue queue = new Queue(10);

        // Add element to queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Peek the first element
        System.out.println("The front element is " + queue.peek());

        // Remove an element from queue
        System.out.println("Removing an element from queue: ");
        queue.dequeue();
        System.out.println("The front element is " + queue.peek());

        // Get the size of the queue
        System.out.println("The queue size is " + queue.size());

        queue.dequeue();
        queue.dequeue();

        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
    }

}



































