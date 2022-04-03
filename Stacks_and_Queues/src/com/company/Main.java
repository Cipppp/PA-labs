package com.company;

public class Main {

    public static void main(String[] args) {

        //! Queue implementation
        Queue queue = new Queue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("The front element is " + queue.peek());

        System.out.println("Removing an element from queue: ");
        queue.dequeue();
        System.out.println("The front element is " + queue.peek());

        System.out.println("The queue size is " + queue.size());

        queue.dequeue();
        queue.dequeue();

        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }

        //! Stack implementation
        Stack stack = new Stack(3);

        stack.push(1); // Inserting 1 in the stack
        stack.push(2); // Inserting 2 in the stack

        stack.pop();    // Removing the top element (2)
        stack.pop();    // Removing the top element (1)

        stack.push(3); // Inserting 3 in the stack
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());

        stack.pop();

        // Check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack is not empty");
        }


    }
}
