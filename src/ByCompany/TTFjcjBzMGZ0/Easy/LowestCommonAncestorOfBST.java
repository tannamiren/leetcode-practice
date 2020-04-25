package ByCompany.TTFjcjBzMGZ0.Easy;

import NodeClasses.TreeNode;

public class LowestCommonAncestorOfBST {
    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == null || q == null || root == null) return null;
        else if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q); //as root is greater than p, q. Then p, q must be smaller than root, so go to left
        else if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);//as root is lower than p, q. Then p, q must be greater than root, so go to right
        else return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        System.out.println(new LowestCommonAncestorOfBST().lowestCommonAncestor(root, root.left, root.right).val);
        System.out.println(new LowestCommonAncestorOfBST().lowestCommonAncestor(root, root.left, root.left.right).val);
    }
}
