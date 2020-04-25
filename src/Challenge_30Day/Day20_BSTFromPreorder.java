package Challenge_30Day;

import NodeClasses.TreeNode;

public class Day20_BSTFromPreorder {
    int index=0;

    private TreeNode helper(int min, int max, int[] num) {
        if(index == num.length) return null;
        int val = num[index];

        if(val < min || val > max) return null;

        index++;
        TreeNode root= new TreeNode(val);
        root.left = helper(min, val, num);
        root.right = helper(val, max, num);
        return root;
    }

    private TreeNode bstFromPreorder(int[] preorder) {
        return helper(Integer.MIN_VALUE, Integer.MAX_VALUE, preorder);
    }

    public static void main(String[] args) {
//        System.out.println(new Day20_BSTFromPreorder().bstFromPreorder(new int[]{8, 5}).val);
        System.out.println(new Day20_BSTFromPreorder().bstFromPreorder(new int[]{8, 5, 1, 7, 10, 12}).val);
    }
}
