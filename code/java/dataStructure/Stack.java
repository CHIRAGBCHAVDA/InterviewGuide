package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stack;
    private int size, top;

    public Stack(int size) {
        stack = new ArrayList<T>(size);
        this.size = size;
        top = 0;
    }

    /// Added Element into the Stack
    public void push(T element) throws Exception {
        // Check if stack is full or not
        if (isFull()) {
            throw new Exception("Stack Overflow");
        }
        stack.add(top, element);
        top++;
    }

    /// Removes the latest added element from the Stack and returns it
    public T pop() throws Exception {
        // Check if stack is empty or not
        if (isEmpty()) {
            throw new Exception("Stack Underflow");
        }
        return stack.remove(--top);
    }

    /// Shows the latest added element in the Stack
    public T peep() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Underflow");
        }
        return stack.get(top - 1);
    }

    /// Return the size of Stack
    public int size() {
        return size;
    }

    /// Return the index of last last element
    public int top() {
        return top;
    }

    /// Represents weather the Stack is empty or not
    public boolean isEmpty() {
        return top == 0;
    }

    /// Represents weather the Stack is full or not
    public boolean isFull() {
        return top == size;
    }

    public String toString() {
        return stack.toString();
    }
}
