class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchingTugas3 {
    Node head;

    private Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        return current;
    }

    public int binarySearch(int x, int n) {
        int L = 0;
        int R = n - 1;
        boolean ketemu = false;
        int m = -1;

        while (L <= R && !ketemu) {
            m = (L + R) / 2;
            Node midNode = getNode(m);
            if (midNode == null) break;
            
            if (midNode.data == x) {
                ketemu = true;
            } else if (x < midNode.data) {
                R = m - 1;
            } else {
                L = m + 1;
            }
        }

        if (ketemu) {
            return m;
        } else {
            return -1;
        }
    }
}