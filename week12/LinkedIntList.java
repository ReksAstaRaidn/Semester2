package JavaSem2.week12;

public class LinkedIntList {

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

    public boolean contains(int value) {
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return true; // Nilai ditemukan
            }
            current = current.next;
        }
        return false; // Nilai tidak ditemukan setelah traversing seluruh list
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
}
