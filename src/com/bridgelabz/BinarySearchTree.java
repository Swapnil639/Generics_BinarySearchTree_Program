package com.bridgelabz;

public class BinarySearchTree {
    Node root;
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(56);
        tree.insert(30);
        tree.insert(22);
        tree.insert(40);
        tree.insert(11);
        tree.insert(3);
        tree.insert(16);
        tree.insert(70);
        tree.insert(60);
        tree.insert(95);
        tree.insert(65);
        tree.insert(63);
        tree.insert(67);
        tree.display();
        System.out.println("Size of the elements is :"+tree.size());
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
    public int findingSize(Node root) {
        if (root == null) {
            return 0;
        } else {
            return findingSize(root.right) + 1 + findingSize(root.left);
        }
    }

    public int size() {
        return findingSize(root);
    }


}