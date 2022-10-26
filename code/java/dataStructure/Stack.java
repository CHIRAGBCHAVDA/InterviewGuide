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

    public void push(T element) throws Exception {
        if (isFull()) {
            throw new Exception("Stack Overflow");
        }
        stack.add(top, element);
        top++;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Underflow");
        }
        return stack.remove(--top);
    }

    public T peep() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack Underflow");
        }
        return stack.get(top - 1);
    }

    public int size() {
        return size;
    }

    public int top() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == size;
    }

    public String toString() {
        return stack.toString();
    }
}
