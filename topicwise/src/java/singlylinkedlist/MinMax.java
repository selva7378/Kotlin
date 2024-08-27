package java.singlylinkedlist;

public class MinMax {
    public static void main(String[] args) {

    }

    static int maximum(Node head)
    {
        // your code here
        int max = Integer.MIN_VALUE;
        Node temp = head;
        while(temp != null){
            max = Math.max(max, temp.data);
            temp = temp.next;
        }
        return max;
    }

    static int minimum(Node head)
    {
        // your code here
        int min = Integer.MAX_VALUE;
        Node temp = head;
        while(temp != null){
            min = Math.min(min, temp.data);
            temp = temp.next;
        }
        return min;
    }
}
