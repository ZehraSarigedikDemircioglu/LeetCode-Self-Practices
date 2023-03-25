package MyHashMap;

public class MyHashMap {

    Node head;
    Node tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    public void put(int key, int value) {
        Node node = new Node(key, value);
        Node current = head;
        if (head == null) { // if map is empty
            head = tail = node;
        }else {
            if (tail.key ==key) {
                tail.value = value;
                return;
            }
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public int get(int key) {

        Node current = head;
        while (current != null) {
            if (current.key == key) {
                return key;
            }
            current = current.next;
        }
        return -1;

    }

    public void remove(int key) {
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.key == key) {

                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail) {
                    tail = prev;
                    prev.next = null;
                } else {
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }
    }

    void printNodes() {

        Node current = head;
        // Map<Integer, Integer> map = new HashMap<>();
        if (current == null) System.out.println("null");
        while (current != null) {
            System.out.print("(" + current.key + "," + current.value + ")");
            current = current.next;
        }
        System.out.println();
    }
}
