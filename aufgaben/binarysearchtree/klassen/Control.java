package video.binarysearchtree;

public class Control {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(6);
        bst.insert(2);
        bst.insert(4);

        bst.printPreOrder();
        System.out.println();

        bst.printInOrder();
        System.out.println();

        bst.printPostOrder();
        System.out.println();
    }
}
