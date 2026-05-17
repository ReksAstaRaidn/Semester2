public class Main {
    public static void main(String[] args) {
        System.out.println("Output Soal 1");
        SearchingTugas1 l1 = new SearchingTugas1();
        l1.head = new Node(10);
        l1.head.next = new Node(25);
        l1.head.next.next = new Node(30);
        System.out.println("Cari 25: Index " + l1.sequentialSearch(25));
        System.out.println("Cari 100: Index " + l1.sequentialSearch(100));

        System.out.println("\n Output Soal 2 ");
        SearchingTugas2 l2 = new SearchingTugas2();
        int[] arr2 = {10, 20, 30};
        arr2 = l2.insertArray(arr2, 40);
        System.out.print("Array setelah insert 40: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        l2.insertLinkedList(10);
        l2.insertLinkedList(50);
        System.out.print("SLL setelah insert 10 dan 50: ");
        l2.printLinkedList();

        System.out.println("\n Output Soal 3");
        SearchingTugas3 l3 = new SearchingTugas3();
        l3.head = new Node(10);
        l3.head.next = new Node(20);
        l3.head.next.next = new Node(30);
        l3.head.next.next.next = new Node(40);
        System.out.println("Cari 30: Index " + l3.binarySearch(30, 4));

        System.out.println("\n Output Soal 4");
        SearchingTugas4 l4 = new SearchingTugas4();
        int[] arr4 = {10, 20, 40};
        arr4 = l4.insertSortedArray(arr4, 30);
        System.out.print("Array Sorted setelah insert 30: ");
        for (int i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println();

        l4.insertSortedLinkedList(25);
        l4.insertSortedLinkedList(5);
        System.out.print("SLL setelah insert 25 dan 5: ");
        l4.printLinkedList();
    }
}