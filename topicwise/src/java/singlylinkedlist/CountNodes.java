package java.singlylinkedlist;


class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

public class CountNodes {
    public static void main(String[] args) {

    }

    public int getCount(Node head) {
        // code here
        int res = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            res++;
        }
        return res;
    }
}
