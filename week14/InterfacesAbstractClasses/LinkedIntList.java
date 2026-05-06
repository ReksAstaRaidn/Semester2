public class LinkedIntList extends AbstractIntList {

    private ListNode front; // Penunjuk elemen pertama (Head)
    
    // Constructor list kosong 
    public LinkedIntList() {
        front = null;
    }

     // Metode 1: Menambahkan elemen di bagian paling depan (Sangat Cepat!)
    public void addFront(int value) {
        // Buat node baru, arahkan next-nya ke front saat ini, lalu pindahkan front ke node baru
        front = new ListNode(value, front);
    }

    // Metode 2: Mencetak isi list (Traversal)
    public void print() {
        System.out.print("Isi Linked List: ");
        
        // Aturan Emas: JANGAN PERNAH MENGUBAH NILAI 'front' SAAT TRAVERSAL!
        // Gunakan variabel sementara (current)
        ListNode current = front;
        
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Pindah ke node berikutnya
        }
        System.out.println("null");
    }

    public void add(int value) {
        if (front == null) {
            // Kasus khusus: Jika list masih kosong
            front = new ListNode(value);
        } else {
            // Berjalan sampai node TERAKHIR (bukan sampai null, tapi sampai node.next == null)
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            // Sambungkan node baru di akhir
            current.next = new ListNode(value);
        }
    }

    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        
        if (index == 0) {
            // Hapus node pertama
            front = front.next;
        } else {
            // Temukan node sebelum node yang akan dihapus
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            // Lewati node yang akan dihapus
            current.next = current.next.next;
        }
    }

    public int get(int index) {
        checkIndex(index); // Gunakan metode bantuan dari AbstractIntList
        
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int indexOf(int value) {
        ListNode current = front;
        int index = 0;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Tidak ditemukan
    }


    @Override
    public void add(int index, int value) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        
        if (index == 0) {
            addFront(value);
        } else {
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            // Sisipkan node baru di antara current dan current.next
            current.next = new ListNode(value, current.next);
        }
    }
}
