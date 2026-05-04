import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {

    private ListNode<E> front; // Penunjuk elemen pertama (Head)
    
    // Constructor list kosong 
    public MyLinkedList() {
        front = null;
    }

     // Ubah parameter dari int menjadi E
    public void add(E value) {
        if (front == null) {
            front = new ListNode<>(value);
        } else {
            ListNode<E> current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode<>(value);
        }
    }

    public void remove(E value) {
        if (front == null) {
            return;
        }

        if ((front.data == null && value == null) || (front.data != null && front.data.equals(value))) {
            front = front.next;
            return;
        }

        ListNode<E> current = front;
        while (current.next != null) {
            if ((current.next.data == null && value == null) ||
                (current.next.data != null && current.next.data.equals(value))) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

     // --- Implementasi wajib dari interface Iterable ---
    @Override
    public Iterator<E> iterator() {
        // Mengembalikan objek "penjelajah" khusus untuk list ini
        return new LinkedIterator();
    }

    // --- Inner Class Iterator ---
    // Class ini mengimplementasikan antarmuka standar Java java.util.Iterator
    private class LinkedIterator    implements Iterator<E> {
        private ListNode<E> current; // Node yang akan dikembalikan berikutnya
        private ListNode<E> previous; // Node terakhir yang dikembalikan
        private ListNode<E> previousPrevious; // Node sebelum node terakhir yang dikembalikan
        private boolean canRemove; // Mengontrol apakah remove() valid

        public LinkedIterator() {
            current = front; // Memulai perjalanan dari depan
            previous = null;
            previousPrevious = null;
            canRemove = false;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }

            E result = current.data;
            previousPrevious = previous;
            previous = current;
            current = current.next;
            canRemove = true;
            return result;
        }

        @Override
        public void remove() {
            if (!canRemove) {
                throw new IllegalStateException("remove() dipanggil tanpa next() atau setelah remove() sebelumnya");
            }

            if (previousPrevious == null) {
                // Menghapus node pertama di list
                front = current;
            } else {
                // Menghapus node selanjutnya di dalam list
                previousPrevious.next = current;
            }

            previous = previousPrevious;
            canRemove = false;
        }
    }
}
