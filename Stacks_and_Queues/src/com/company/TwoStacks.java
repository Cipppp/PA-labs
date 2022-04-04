package com.company;

public class TwoStacks {
    private int size;
    private int front1, front2;

    private int array[];

    // Constructor
    public TwoStacks(int dim) {
        this.array = new int[dim];
        this.size = dim;
        this.front1 = -1;
        this.front2 = size;
    }

    // Method to push an element x to stack1
    void push1(int number) {
        // There is at least one empty space for new element
        if (front1 < front2 - 1) {
            front1++;
            array[front1] = number;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    // Method to push an element x to stack2
    void push2(int number) {
        // There is at least one empty space for new element
        if (front1 < front2 - 1) {
            front2--;
            array[front2] = number;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    // Method to pop an element from first stack
    int pop1() {
        if (front1 >= 0) {
            int number = array[front1];
            front1--;
            return number;
        } else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        return 0;
    }

    // Method to pop an element from second stack
    int pop2() {
        if (front2 < size) {
            int number = array[front2];
            front2++;
            return number;
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }

        return 0;
    }


    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(5);

        // Add elements to array
        twoStacks.push1(5);
        twoStacks.push2(10);
        twoStacks.push2(15);
        twoStacks.push1(11);
        twoStacks.push2(7);

        System.out.println("Popped element from" + " stack1 is " + twoStacks.pop1());
        twoStacks.push2(40);
        System.out.println("Popped element from" + " stack2 is " + twoStacks.pop2());
    }

}
