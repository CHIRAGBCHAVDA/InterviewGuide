package dataStructure;

public class CircularQueue<T> {
    int size, f = -1, r = -1;
    T[] queue;

    public CircularQueue(T[] queue) {
        this.queue = queue;
        this.size = queue.length;
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else if (isEmpty()) {
            f = 0;
            r = 0;
        } else {
            r = (r + 1) % size;
        }
        queue[r] = item;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T item = queue[f];
        if (f == r) {
            f = -1;
            r = -1;
        } else {
            f = (f + 1) % size;
        }
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queue[f];
    }

    public boolean isEmpty() {
        return f == -1;
    }

    public boolean isFull() {
        return (r + 1) % size == f;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (f < r) {
            return r - f;
        } else {
            return size - (f - r);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (f < r) {
            for (int i = f; i <= r; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = f; i < size; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i <= r; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
