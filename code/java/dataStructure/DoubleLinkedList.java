package dataStructure;

public class DoubleLinkedList<T> {
    ListNode<T> head;

    public int length() {
        int count = 0;
        ListNode<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public String traverse() {
        String result = "";
        ListNode<T> current = head;
        while (current != null) {
            result += current.data + ", ";
            current = current.next;
        }
        return result;
    }

    public void insert(T data, int position) {
        ListNode<T> temp = new ListNode<T>(data);
        if (position == 0) {
            if (head != null) {
                temp.next = head;
                head.prev = temp;
            }
            head = temp;
        } else {
            int counter = 1;
            ListNode<T> current = head;
            while (current.next != null && counter < position) {
                current = current.next;
                counter++;
            }
            if (current.next != null) {
                temp.next = current.next;
                current.next.prev = temp;
            }
            temp.prev = current;
            current.next = temp;
        }
    }

    public T delete(int position) {
        if (position == 0) {
            T temp = head.data;
            head = head.next;
            head.prev = null;
            return temp;
        } else {
            int counter = 0;
            ListNode<T> current = head;
            while (current.next != null && counter < position) {
                current = current.next;
                counter++;
            }
            ListNode<T> prev = current.prev;
            ListNode<T> next = current.next;
            prev.next = next;
            if (next != null) {
                next.prev = prev;
            }
            return current.data;
        }
    }
}

class ListNode<T> {
    T data;
    ListNode<T> prev, next;

    public ListNode(T data) {
        this.data = data;
    }
}