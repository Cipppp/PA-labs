package com.company;

public class TwoStacks {
    private int size;
    private int top1, top2;

    private int array[];

    // Constructor
    public TwoStacks(int n) {
        array = new int[n];
        size = n;
        top1 = -1;
        top2 = size;
    }

    // Method to push an element x to stack1
    void push1(int x) {
        // There is at least one empty space for new element
        if (top1 < top2 - 1)    }

}
