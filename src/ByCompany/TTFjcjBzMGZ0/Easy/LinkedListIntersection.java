package ByCompany.TTFjcjBzMGZ0.Easy;

import NodeClasses.ListNode;

public class LinkedListIntersection {
    private ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null) return null;
        if (headB == null) return null;

        ListNode A = headA;
        ListNode B = headB;
//        while (headA != headB) {
//            headA = headA.next;
//            headB = headB.next;
//
//            if(headA == headB) return headA;
//
//            if (headA == null) {
//                headA = B;
//            }
//            if (headB == null) {
//                headB = A;
//            }
//      }

        while (A != B) {
            A = A != null? A.next: headB;
            B = B != null? B.next: headA;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        root.next = new ListNode(2);
        root.next.next = new ListNode(0);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);

        ListNode root2 = new ListNode(1);
        root2.next = new ListNode(2);
        root2.next.next = root.next.next;

        System.out.println(new LinkedListIntersection().getIntersectionNode(root, root2).val);
    }
}
