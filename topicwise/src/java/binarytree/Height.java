package java.binarytree;

public class Height {
    int height(Node node)
    {
        if(node == null) return 0;
        // code here
        int res = Math.max(height(node.left), height(node.right));

        return res + 1;
    }


}
