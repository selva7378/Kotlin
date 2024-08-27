package java.singlylinkedlist;

public class InsertAtPosition {
    static void insertAtPosition(Node head, int pos, int data)
    {
        // your code here
        Node newNode = new Node(data);
        if(pos == 1 && head == null){
            newNode.next = head;
            return;
        }
        Node temp = head;
        for(int i = 1; i < pos; i++){
            if(temp == null) break;
            temp = temp.next;
        }
        if(temp == null ) return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

}
