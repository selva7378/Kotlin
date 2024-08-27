package java.singlylinkedlist;

public class InsertAtMiddle {
    public static void main(String[] args) {

    }

    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        int listLen = 0;
        while(temp != null){
            listLen++;
            temp = temp.next;
        }

        int mid = 0;
        if(listLen % 2 == 0){
            mid = listLen / 2 - 1;
        }else{
            mid = listLen / 2;
        }

        temp = head;
        for(int i = 0; i < mid; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
