package java.singlylinkedlist;

import java.util.ArrayList;

public class Display {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> displayList(Node head)
    {
        // Your code here
        ArrayList<Integer> arr = new ArrayList();
        Node temp = head;
        while(temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        return arr;
    }
}
