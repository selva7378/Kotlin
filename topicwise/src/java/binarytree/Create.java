package java.binarytree;

public class Create {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        Node root = null;
        createBinaryTree(root, arr);
    }

    private static void createBinaryTree(Node root, int[] arr){
        Math.abs(1 - 2);
    }
    static int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
        // code here
        int arr[] = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int noOfDaysy1 = 365 * y1 + y1 / 4 - y1 / 100 + y1 / 400;
        int noOfDaysy2 = 365 * y2 + y2 / 4 - y2 / 100 + y2 / 400;

        for(int i = 0; i < m1; i++){
            noOfDaysy1 += arr[i];
            if(i == 1 && isLeapYear(y1)){
                noOfDaysy1++;
            }
        }

        for(int i = 0; i < m2; i++){
            noOfDaysy2 += arr[i];
            if(i == 1 && isLeapYear(y2)){
                noOfDaysy2++;
            }
        }

        return Math.abs(noOfDays1 - noOfDays2);
    }
}
