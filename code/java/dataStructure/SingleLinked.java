package dataStructure;

public class SingleLinked<T> {
    SingleLinkedNode<T> head;

    public int length() {
        int count = 0;
        SingleLinkedNode<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public String traverse() {
        String result = "";
        SingleLinkedNode<T> current = head;
        while (current != null) {
            result += current.data + ", ";
            current = current.next;
        }
        return result;
    }

    public void insert(T data, int position) {
        SingleLinkedNode<T> temp = new SingleLinkedNode<T>(data);
        if (position == 0) {
            temp.next = head;
            head = temp;
        } else {
            int counter = 1;
            SingleLinkedNode<T> current = head;
            while (current.next != null && counter < position) {
                current = current.next;
                counter++;
            }
            temp.next = current.next;
            current.next = temp;
        }
    }

    public T delete(int position) {
        if (position == 0) {
            T temp = head.data;
            head = head.next;
            return temp;
        } else {
            int counter = 0;
            SingleLinkedNode<T> current = head;
            SingleLinkedNode<T> previous = head;

            while (current.next != null && counter < position) {
                previous = current;
                current = current.next;
                counter++;
            }
            previous.next = current.next;
            return current.data;
        }
    }

    public T get(int position) {
        int count = 0;
        SingleLinkedNode<T> current = head;

        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        return current != null ? current.data : null;
    }
}

class SingleLinkedNode<T> {
    public T data;
    public SingleLinkedNode<T> next;

    public SingleLinkedNode(T data) {
        this.data = data;
    }
}
