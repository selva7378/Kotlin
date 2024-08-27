package java.singlylinkedlist;

public class Identical {
    public static void main(String[] args) {

    }

    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null){
            if(temp2 == null && temp1 != null) return false;
            if(temp1.data != temp2.data) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1 == null && temp2 == null;
    }
}
