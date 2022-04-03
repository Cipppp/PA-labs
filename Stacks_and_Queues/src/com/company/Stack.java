package com.company;

public class Stack {
    private int array[];
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int capacity) {
        this.capacity = capacity;
    }

    // Utility function to add an element 'x' to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }

        System.out.println("Inserting " + x);
        array[++top] = x;
    }

    // Utility function to pop a top element from the stack
    public int pop() {
        // Check for stack underflow
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Removing " + peek());
        // Decrease stack size by 1 and return the popped element
        return array[top--];
    }

    // Utility function to return the top element of the stack
    public int peek() {
        if (!isEmpty()) {
            return array[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == -1;
    }

    // Utility function to check if the stack is full or not
    public boolean isFull() {
        return top == capacity - 1;
    }
}
