package java.singlylinkedlist;

public class Reverse {
    Node reverseList(Node head) {
        // code here
        if(head == null) return head;
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
