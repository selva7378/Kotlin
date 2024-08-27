package java.singlylinkedlist;

public class Sum {
    public static void main(String[] args) {

    }

    public static int sumOfElements(Node head)
    {
        // your code here
        int res = 0;
        Node temp = head;
        while(temp != null){
            res += temp.data;
            temp = temp.next;
        }
        return res;
    }
}
