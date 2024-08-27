package java.singlylinkedlist;

public class DeleteHead {
    public static void main(String[] args) {

    }

    Node deleteHead(Node head)
    {
        // Your code here
        if(head != null)
            head = head.next;
        return head;
    }
}
