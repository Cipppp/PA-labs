package com.company;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BalancedBinaryTree {

    Node root;

    public boolean isBalanced(Node n) {
        return balanceHeight(n) > -1;
    }

//!    Preorder
    private int balanceHeight(Node n) {
        if (n == null) return 0;

        int leftHeight = balanceHeight(n.left);
        int rightHeight = balanceHeight(n.right);

        if (leftHeight == -1 || rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        if (leftHeight > rightHeight) return leftHeight + 1;
        return rightHeight + 1;
    }

    public static void main(String[] args) {
        BalancedBinaryTree tree = new BalancedBinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(1);
        tree.root.right.right = new Node(6);
        tree.root.right.right.right = new Node(6);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced.");
        else
            System.out.println("Tree is not balanced.");
    }
}