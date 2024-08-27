package java.binarytree;

import java.util.ArrayList;

public class InorderTraversal {
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> arr = new ArrayList();
        inorder(root, arr);
        return arr;
    }

    void inorder(Node root, ArrayList<Integer> arr) {
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }
}
