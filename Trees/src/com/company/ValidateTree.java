package com.company;

import java.util.Stack;



public class ValidateTree {
    TreeNode root;
    //! Preorder traversal
//    public boolean isValidateBST(TreeNode root) {
//        return validate(root, null, null);
//    }
//
//    public boolean validate(TreeNode root, Integer max, Integer min) {
//        if (root == null)
//            return true;
//        else if (max != null && root.value >= max || min != null && root.value <= min)
//            return false;
//        else
//            return validate(root.left, root.value, min) && validate(root.right, max, root.value);
//    }

    //! Inorder traversal
    public boolean isValidateBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        double leftChildValue = - Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.value <= leftChildValue) return false;
            leftChildValue = root.value;
            root = root.right;
        }

        return true;
    }

    public static void main(String[] args) {
    /*
             15
           /   \
         7     20
        / \    /
       2  12 17
    */

        ValidateTree binaryTree = new ValidateTree();
        binaryTree.root = new TreeNode(15);
        binaryTree.root.left = new TreeNode(7);
        binaryTree.root.right = new TreeNode(20);
        binaryTree.root.right.left = new TreeNode(17);
        binaryTree.root.left.left = new TreeNode(2);
        binaryTree.root.left.right = new TreeNode(12);
        binaryTree.root.left.right.right = new TreeNode(12);

        if (binaryTree.isValidateBST(binaryTree.root)) {
            System.out.println("It is a binary search tree.");
        } else {
            System.out.println("It's not a binary search tree.");
        }
    }
}
