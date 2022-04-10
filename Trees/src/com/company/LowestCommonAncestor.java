package com.company;

public class LowestCommonAncestor {

    TreeNode root;

    //! Postorder
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode firstNode, TreeNode secondNode) {
        if (firstNode.value < root.value && secondNode.value < root.value)
            return lowestCommonAncestor(root.left, firstNode, secondNode);

        if (firstNode.value > root.value && secondNode.value > root.value)
            return lowestCommonAncestor(root.right, firstNode, secondNode);

        return root;
    }

    public static void main(String[] args) {
        /*
             15
           /   \
         7     20
        / \    /
       2  12 17
    */
        LowestCommonAncestor binaryTree = new LowestCommonAncestor();
        binaryTree.root = new TreeNode(15);
        binaryTree.root.left = new TreeNode(7);
        binaryTree.root.right = new TreeNode(20);
        binaryTree.root.right.left = new TreeNode(17);
        binaryTree.root.left.left = new TreeNode(2);
        binaryTree.root.left.right = new TreeNode(12);
        binaryTree.root.left.right.right = new TreeNode(12);

        TreeNode result = lowestCommonAncestor(binaryTree.root, binaryTree.root.right.left, binaryTree.root.right);
        System.out.println(result.value);
    }
}
