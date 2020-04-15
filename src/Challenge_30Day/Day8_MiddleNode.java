package Challenge_30Day;

import Leetcode.Chapters.LinkedList.ListNode;

public class Day8_MiddleNode {
    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast.next != null) {
            slow = slow.next;
            if(fast.next.next != null)
                fast = fast.next.next;
            else
                return slow;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        System.out.println(new Day8_MiddleNode().middleNode(root).val);

        root.next = new ListNode(2);
        System.out.println(new Day8_MiddleNode().middleNode(root).val);

        root.next.next = new ListNode(3);
        System.out.println(new Day8_MiddleNode().middleNode(root).val);

        root.next.next.next = new ListNode(4);
        System.out.println(new Day8_MiddleNode().middleNode(root).val);

        root.next.next.next.next = new ListNode(5);
        System.out.println(new Day8_MiddleNode().middleNode(root).val);

        root.next.next.next.next.next = new ListNode(6);
        System.out.println(new Day8_MiddleNode().middleNode(root).val);
    }
}
