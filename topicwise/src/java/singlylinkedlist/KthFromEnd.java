package java.singlylinkedlist;

public class KthFromEnd {
    public static void main(String[] args) {

    }
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node tempFirst = head;
        Node tempSecond = head;
        for(int i = 1; i <= k; i++){
            if(tempFirst == null) return -1;
            tempFirst = tempFirst.next;
        }

        while(tempFirst != null){
            tempFirst = tempFirst.next;
            tempSecond = tempSecond.next;
        }
        return tempSecond.data;
    }
}
