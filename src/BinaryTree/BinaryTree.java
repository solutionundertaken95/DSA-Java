package src.BinaryTree;

class Node{
    int data;
    Node right;
    Node left;

    public Node(int data){
        this.data = data;
    }

}


public class BinaryTree {

    Node root;

    public void insert(int data){

        root = insertrec(root,data);
    }

    private Node insertrec(Node root, int data) {

        if(root == null){
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertrec(root.left,data);
        }
        else if(data > root.data)
            root.right = insertrec(root.right,data);

        return root;
    }

    public void inorder(){
        inorderrec(root);
    }

    private void inorderrec(Node root) {

        if(root != null){

            inorderrec(root.left);
            System.out.print(root.data + " ");
            inorderrec(root.right);

        }
    }
}
