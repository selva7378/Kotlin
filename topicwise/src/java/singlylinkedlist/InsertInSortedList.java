package java.singlylinkedlist;

public class InsertInSortedList {
    static Node insertInSorted(Node head, int data)
    {
        // your code here
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return head;
        }

        if(head.data > data){
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node temp = head;
        while(temp.next != null) {
            if(temp.next.data > data){
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
}
