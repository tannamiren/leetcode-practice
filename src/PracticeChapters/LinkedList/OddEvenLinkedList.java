package PracticeChapters.LinkedList;

import NodeClasses.ListNode;

public class OddEvenLinkedList {
    private ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(2);
        root.next = new NodeClasses.ListNode(1);
        root.next.next = new NodeClasses.ListNode(3);
        root.next.next.next = new NodeClasses.ListNode(5);
        root.next.next.next.next = new NodeClasses.ListNode(6);
        root.next.next.next.next.next = new NodeClasses.ListNode(4);
        root.next.next.next.next.next.next = new ListNode(7);

        new ListNode(-1).print(new OddEvenLinkedList().oddEvenList(root));
    }
}
