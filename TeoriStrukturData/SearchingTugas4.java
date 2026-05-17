class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchingTugas4 {
    public int[] insertSortedArray(int[] data, int x) {
        int L = 0, R = data.length - 1;
        boolean ketemu = false;
        while (L <= R && !ketemu) {
            int m = (L + R) / 2;
            if (data[m] == x) ketemu = true;
            else if (x < data[m]) R = m - 1;
            else L = m + 1;
        }

        if (ketemu) return data;

        int[] newData = new int[data.length + 1];
        int i = 0, j = 0;
        while (i < data.length && data[i] < x) {
            newData[j++] = data[i++];
        }
        newData[j++] = x;
        while (i < data.length) {
            newData[j++] = data[i++];
        }
        return newData;
    }

    Node head;
    public void insertSortedLinkedList(int x) {
        if (head == null || head.data > x) {
            Node newNode = new Node(x);
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null && current.next.data < x) {
            current = current.next;
        }

        if (current.data == x || (current.next != null && current.next.data == x)) {
            return;
        }

        Node newNode = new Node(x);
        newNode.next = current.next;
        current.next = newNode;
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