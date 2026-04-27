package JavaSem2.week12.Teori;

import JavaSem2.week12.ListNode;


public class MainLinkedList {
    
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(10);
        listNode1.next = new ListNode(20);

        ListNode listNode2 = new ListNode(30);
        listNode2.next = new ListNode(40);

        printList(listNode1);
        printList(listNode2);
        System.out.println();

        ListNode pindahList = listNode2;

        listNode2 = listNode2.next;

        pindahList.next = listNode1.next;

        listNode1.next = pindahList;

        printList(listNode1);
        printList(listNode2);

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
