class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchingTugas1 {
    Node head;

    public int sequentialSearch(int x) {
        Node current = head;
        int index = 0;
        boolean ketemu = false;

        while (current != null && !ketemu) {
            if (current.data == x) {
                ketemu = true;
            } else {
                current = current.next;
                index++;
            }
        }

        if (ketemu) {
            return index;
        } else {
            return -1;
        }
    }
}