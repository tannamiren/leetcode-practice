package PracticeChapters.LinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public void traverseList(ListNode root) {
        if(root == null) return;

        ListNode actualNode = root;
        while(actualNode != null) {
            System.out.print(actualNode.val + " -> ");
            actualNode = actualNode.next;
        }
    }
}
