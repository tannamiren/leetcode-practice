package ByCompany.TTFjcjBzMGZ0.Easy;

import NodeClasses.ListNode;

public class LinkedListCycle {
    private boolean hasCycle(ListNode head) {
        if(head == null) return false;
        if(head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != null && fast != null && fast.next != null) {
            if(slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        root.next = new ListNode(2);
        root.next.next = new ListNode(0);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = root.next;

        System.out.println(new LinkedListCycle().hasCycle(root));
    }
}
