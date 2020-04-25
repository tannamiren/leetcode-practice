package PracticeChapters.LinkedList;


import NodeClasses.ListNode;

public class LinkedListCycle {
    private boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null)
            return false;
        if(head.next == null)
            return false;
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode root1 = new ListNode(3);
        root1.next = new ListNode(2);
        root1.next.next = new ListNode(0);
        root1.next.next.next = new ListNode(-4);
        root1.next.next.next.next = root1.next;
        System.out.println(new LinkedListCycle().hasCycle(root1));

        ListNode root2 = new ListNode(1);
        root2.next = new ListNode(2);
        root2.next = root2;
        System.out.println(new LinkedListCycle().hasCycle(root2));

        ListNode root3 = new ListNode(1);
        System.out.println(new LinkedListCycle().hasCycle(root3));
    }
}
