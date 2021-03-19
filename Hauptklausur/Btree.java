package Hauptklausur;

public class Btree {
    private Node root;

    private class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }

    public int sumPosNodes(Node node){
        if (node.left == null && node.right == null){
            return Math.max(0,node.key);
        }
        if(node.left == null){
            return Math.max(0,node.key)+sumPosNodes(node.right);
        }
        if(node.right == null){
            return Math.max(0,node.key)+sumPosNodes(node.left);
        }
        return Math.max(0,node.key)+sumPosNodes(node.left)+sumPosNodes(node.right);

    }

    public int sumPosNodes() {
        return sumPosNodes(root);
    }
}