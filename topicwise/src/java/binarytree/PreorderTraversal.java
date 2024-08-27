package java.binarytree;
import java.util.ArrayList;

 class Node{
     int data;
     Node left,right;
     Node(int d){
         data=d;
         left=right=null;
     }
 }

public class PreorderTraversal {
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList();
        preOrder(root, arr);
        return arr;

    }

    static void preOrder(Node root, ArrayList<Integer> arr){
        if(root == null) return;

        arr.add(root.data);
        preOrder(root.left, arr);
        preOrder(root.right, arr);
    }
}
