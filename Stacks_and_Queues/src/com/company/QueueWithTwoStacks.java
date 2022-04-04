package com.company;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueWithTwoStacks<Item> {
    private Stack<Integer> stack1;    // back of queue
    private Stack<Integer> stack2;    // front of queue

    // Create an empty queue
    public QueueWithTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Move all items from stack1 to stack2
    private void moveStack1ToStack2() {
        while (!stack1.isEmpty())
            stack2.push((stack1.pop()));
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Return the number of items in the queue
    public int size() {
        return stack1.size() + stack2.size();
    }

    // Return last item added to the queue
    public Integer peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (stack2.isEmpty()) moveStack1ToStack2();
        return stack2.peek();
    }

    // Add the item to the queue
    public void enqueue(Integer item) {
        stack1.push(item);
    }

    // Remove and return the item on the queue least recently added
    public Integer dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (stack2.isEmpty()) moveStack1ToStack2();
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueWithTwoStacks<Integer> queue= new QueueWithTwoStacks<Integer>();

        // Add elements to queue
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        // First queue element
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());

        // Remove element from queue
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        // Display queue dimension
        System.out.println(queue.size());
    }


}
