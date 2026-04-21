package JavaSem2.week12;

public class MainLinkedList {
    
    public static void main(String[] args) {
        
    ListNode n1 = new ListNode(5);
    ListNode n2 = new ListNode(4);
    ListNode n3 = new ListNode(2);
    System.out.println(n1.data);
    System.out.println(n1.next);//
    // saya sammbung n1.next ke n2
    n1.next = n2;
    System.out.println(n1.next.data);
    System.out.println(n2.data);
    n2.next = n3;
    System.out.println(n2.next.data);
    System.out.println(n3.data);
    // mengakses data n3 dari n1
    System.out.println(n1.next.next.data);

    ListNode front = n1;
    // mengakses seluruh data dari front
    System.out.println("Data dari front:");
    while (front != null) {
        System.out.println(front.data);
        front = front.next;
    }
    System.out.println(front);

    LinkedIntList list = new LinkedIntList();
    list.add(10);
    list.add(20);
    list.add(30);

    System.out.println("Size list: " + list.size());

    System.out.println("Mengecek apakah list mengandung 20: " + list.contains(20));
     
    System.out.println("Mengeluarkan seluruh elemen list:");
    list.print();
    list.remove(1);
    list.print();

    /*
        // Membuat simpul-simpul
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);

        // Menghubungkan simpul-simpul
        node1.next = node2; // node1 -> node2
        node2.next = node3; // node2 -> node3

        // Menampilkan data dari setiap simpul
        ListNode current = node1; // Mulai dari simpul pertama
        while (current != null) {
            System.out.println(current.data); // Cetak data simpul saat ini
            current = current.next; // Pindah ke simpul berikutnya
        }
            */
   }

        
     




    
}
