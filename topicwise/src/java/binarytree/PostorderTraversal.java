package java.binarytree;

import java.util.ArrayList;

public class PostorderTraversal {
    ArrayList<Integer> postOrder(Node root)
    {
        // Your code goes here
        ArrayList<Integer> arr = new ArrayList();
        postorder(root, arr);
        return arr;
    }

    void postorder(Node root, ArrayList<Integer> arr) {
        if(root == null) return;
        postorder(root.left, arr);
        postorder(root.right, arr);
        arr.add(root.data);
    }
}
