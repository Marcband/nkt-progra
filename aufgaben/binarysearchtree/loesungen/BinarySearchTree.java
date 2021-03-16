package tasks.bst;

public class BinarySearchTree {
    Node root;

    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public void insert(int value) {
        root = insertRek(root, value);
    }

    private Node insertRek(Node root, int value) {
        if (root == null) {
            root = new Node(value, null, null);
            return root;
        }
        if (value < root.value) root.left = insertRek(root.left, value);
        else root.right = insertRek(root.right, value);
        return root;
    }

    public void printPreOrder() {
        preOrder(root);
    }

    private void preOrder(Node n) {
        System.out.print(n.value + " ");
        if(n.left != null) preOrder(n.left);
        if(n.right != null) preOrder(n.right);
    }

    public void printInOrder() {
        inOrder(root);
    }

    private void inOrder(Node n) {
        if(n.left != null) inOrder(n.left);
        System.out.print(n.value + " ");
        if(n.right != null) inOrder(n.right);
    }

    public void printPostOrder() {
        postOrder(root);
    }

    private void postOrder(Node n) {
        if(n.left != null) postOrder(n.left);
        if(n.right != null) postOrder(n.right);
        System.out.print(n.value + " ");
    }

    //Aufgaben
    public void remove(int value) {
        root = removeRek(root, value);
    }

    private Node removeRek(Node root, int value) {
        if (root == null) return root;
        if (value < root.value) root.left = removeRek(root.left, value);
        else if (value > root.value) root.right = removeRek(root.right, value);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.value = minValue(root.right);
            root.right = removeRek(root.right, root.value);
        }
        return root;
    }

    private int minValue(Node temp)  {
        int min = temp.value;
        while (temp.left != null)  {
            min = temp.left.value;
            temp = temp.left;
        }
        return min;
    }
}
