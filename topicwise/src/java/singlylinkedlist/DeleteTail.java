package java.singlylinkedlist;

public class DeleteTail {
    static Node deleteTail(Node head)
    {
        // Your code here
        if(head == null) return head;
        if(head.next == null){
            head = null;
            return head;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
