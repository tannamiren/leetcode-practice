package PracticeChapters.LinkedList;

import NodeClasses.ListNode;

public class PalindromeLinkedList {
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode curr = head;
        int count =0;

        while(curr != null) {
            curr = curr.next;
            count++;
        }
        int currCount = 1;
        curr = head;
        while(currCount < count/2) {
            curr = curr.next;
            currCount++;
        }

        ListNode currNext = reverseList(curr.next);
        curr = head;
        while(currNext != null) {
            if(currNext.val != curr.val) return false;
            curr = curr.next;
            currNext = currNext.next;
        }
return true;
    }

    public static void main(String[] args) {
        NodeClasses.ListNode root = new NodeClasses.ListNode(1);
        root.next = new NodeClasses.ListNode(2);
        root.next.next = new NodeClasses.ListNode(3);
        root.next.next.next = new NodeClasses.ListNode(2);
        root.next.next.next.next = new NodeClasses.ListNode(1);

        System.out.println(new PalindromeLinkedList().isPalindrome(root));
    }
}
