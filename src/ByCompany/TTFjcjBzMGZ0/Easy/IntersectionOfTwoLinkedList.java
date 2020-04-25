package ByCompany.TTFjcjBzMGZ0.Easy;

import NodeClasses.ListNode;

public class IntersectionOfTwoLinkedList {
    private ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;

        while(A != B) {
            A = A!= null? A.next: headB;
            B = B!= null? B.next: headA;
        }

        return A;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(4);
        one.next = new ListNode(1);
        one.next.next = new ListNode(8);
        one.next.next.next = new ListNode(4);
        one.next.next.next.next = new ListNode(5);

        ListNode two = new ListNode(5);
        two.next = new ListNode(0);
        two.next.next = new ListNode(1);
        two.next.next.next = one.next.next;

        ListNode three = new ListNode(5);
        two.next = new ListNode(0);
        two.next.next = new ListNode(1);

        System.out.println(new IntersectionOfTwoLinkedList().getIntersectionNode(one, two).val);
        System.out.println(new IntersectionOfTwoLinkedList().getIntersectionNode(one, three).val);
    }
}
