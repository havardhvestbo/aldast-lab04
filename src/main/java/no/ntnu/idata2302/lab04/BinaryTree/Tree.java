package no.ntnu.idata2302.lab04.BinaryTree;


class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() { root = null; }

    void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printInorder() { printInorder(root); }

    void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    void printPostorder() { printPostorder(root); }

    void printPreorder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPreorder() { printPreorder(root); }



    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(
            "Inorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println(
            "\nPostorder traversal of binary tree is ");
        tree.printPostorder();

        System.out.println(
            "\nPreorder traversal of binary tree is ");
        tree.printPreorder();
    }
}