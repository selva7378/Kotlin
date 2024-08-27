package java.binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class LevelorderTraversal {
    static ArrayList<Integer> levelOrder(Node root)
    {
        // Your code here
        ArrayList<Integer> arr = new ArrayList();
        ArrayDeque<Node> deque = new ArrayDeque();
        deque.offerLast(root);
        while(!deque.isEmpty()){
            Node curr = deque.pollFirst();
            arr.add(curr.data);
            if(curr.left != null){
                deque.offerLast(curr.left);
            }
            if(curr.right != null) {
                deque.offerLast(curr.right);
            }
        }
        return arr;
    }
}
