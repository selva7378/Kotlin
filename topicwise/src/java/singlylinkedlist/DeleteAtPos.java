package java.singlylinkedlist;

public class DeleteAtPos {
    public static void main(String[] args) {

    }

    Node deleteAtPosition(Node head, int pos)
    {
        // your code here
        int count = 1;
        Node temp = head;
        if(pos == 1 && head != null){
            head = head.next;
            return head;
        }
        while(temp.next != null){
            if(count == pos - 1){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}
