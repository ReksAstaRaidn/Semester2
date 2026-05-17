class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchingTugas2 {
    public int[] insertArray(int[] data, int x) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == x) {
                return data;
            }
        }
        int[] newData = new int[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        newData[data.length] = x;
        return newData;
    }

    Node head;
    public void insertLinkedList(int x) {
        if (head == null) {
            head = new Node(x);
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.data == x) return;
            current = current.next;
        }
        if (current.data == x) return;
        current.next = new Node(x);
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}