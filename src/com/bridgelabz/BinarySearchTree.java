package com.bridgelabz;

public class BinarySearchTree {
    Node root;
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        tree.display();
        System.out.println();
    }

    void insert(int data) {
        root = insertData(root, data);
    }

    Node insertData(Node root, int data) {
        if (root == null)
            root = new Node(data);
        if (data < root.data) {
            root.left = insertData(root.left, data);
        }
        if (data > root.data) {
            root.right = insertData(root.right, data);
        }
        return root;
    }
    void display() {
        displayNode(root);
    }

    void displayNode(Node root) {
        if (root != null) {
            displayNode(root.left);
            System.out.println(root.data + ",");
            displayNode(root.right);
        }
    }


}