package java.singlylinkedlist;

public class InsertAtEnd {
    public static void main(String[] args) {

    }

    Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
}
