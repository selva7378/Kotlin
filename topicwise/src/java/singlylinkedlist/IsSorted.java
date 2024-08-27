package java.singlylinkedlist;

public class IsSorted {
    public static void main(String[] args) {

    }

    public static boolean isSorted(Node head)
    {
        // your code here
        boolean isAscending = false;
        boolean isDescending = false;
        Node temp = head;
        while(temp.next != null){
            if(temp.data < temp.next.data
                    && !isAscending && !isDescending){
                isAscending = true;
            }else if(temp.data > temp.next.data
                    && !isAscending && !isDescending){
                isDescending = true;
            }

            if(isAscending){
                if(temp.data > temp.next.data){
                    return false;
                }
            }

            if(isDescending){
                if(temp.data < temp.next.data){
                    return false;
                }
            }
            temp = temp.next;
        }
        return true;
    }
}
