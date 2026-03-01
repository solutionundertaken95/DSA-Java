package src.BinaryTree;

public class Main {
    public static void main(String[] args) {


        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(24);
        tree.insert(2);
        tree.insert(6);
        tree.insert(15);
        tree.insert(4);
        tree.insert(20);

        tree.inorder();
    }
}
