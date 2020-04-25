package PracticeChapters.LinkedList;

import NodeClasses.ListNode;

public class RemoveElement {
    private ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;

        ListNode pseudo = new ListNode(-1);
        pseudo.next = head;
        ListNode dummy = pseudo.next;
        ListNode prev = pseudo;
        while(dummy != null) {
            if(dummy.val != val) {
                prev = dummy;
            } else {
                prev.next = dummy.next;
            }
            dummy = dummy.next;
        }

        return pseudo.next;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(6);
        root.next.next.next = new ListNode(3);
        root.next.next.next.next = new ListNode(4);
        root.next.next.next.next.next = new ListNode(5);
        root.next.next.next.next.next.next = new ListNode(6);

        new ListNode(-1).print(new RemoveElement().removeElements(root, 1));
    }
}
