package java.singlylinkedlist;



public class Search {
    public static void main(String[] args) {

    }

    public static boolean searchLinkedList(Node head, int x) {
        // Your code here
        Node temp = head;
        while(temp != null){
            if(x == temp.data) return true;
            temp = temp.next;
        }
        return false;
    }
}
