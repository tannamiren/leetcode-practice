package ByCompany.TTFjcjBzMGZ0.Easy;

import NodeClasses.ListNode;

public class ReverseLinkedList {
    private ListNode reverseListIteratively(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode reverseListRecursively(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next = new ListNode(6);

        root.print(new ReverseLinkedList().reverseListRecursively(root));
    }
}
