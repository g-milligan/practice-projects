package com.practice.datastructures.queue;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    // add element
    public void push(int x) {
        stack1.push(x);
    }

    // since queues are FIFO and stacks are LIFO, 
    // reverse the order of the stack so that the queue FIFO behavior can 
    // be implemented
    private void moveStack1ToStack2InReverseOrder() {
        if (stack2.isEmpty()) {
            // move all of stack1 to stack2 in reverse order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    // get first or top element AND remove it
    public int pop() {
        moveStack1ToStack2InReverseOrder();
        return stack2.pop();
    }

    // get first or top element without removing it
    // QUEUEs are First in First Out
    public int peek() {
        moveStack1ToStack2InReverseOrder();
        return stack2.peek();
    }

    // is the queue empty?
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

}
