package dataStructure;

import java.util.Arrays;

public class Queue<T> {
    private T[] queue;
    private int size, front, rear;

    public Queue(T[] a) {
        queue = a;
        size = a.length;
        front = 0;
        rear = 0;
    }

    public void enqueue(T element) throws Exception {
        if (isFull()) {
            throw new Exception("Queue Overflow");
        }
        queue[rear++] = element;
    }

    public T dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue Underflow");
        }
        return queue[front++];
    }

    public T first() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue Underflow");
        }
        return queue[front];
    }

    public T last() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue Underflow");
        }
        return queue[rear - 1];
    }

    public String toString() {
        String result = "";
        for (int i = front; i < rear; i++) {
            result += queue[i] + ", ";
        }
        return result;
    }

    public int size() {
        return size;
    }

    public int front() {
        return front;
    }

    public int rear() {
        return rear;
    }

    public boolean isFull() {
        return rear == size;
    }

    public boolean isEmpty() {
        return front == rear;
    }
}
