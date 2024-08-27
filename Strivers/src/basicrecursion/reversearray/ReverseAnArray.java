package basicrecursion.reversearray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 5, 4};
        System.out.println(Arrays.toString(arr));
        reverseAnArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseAnArray(int[] arr, int start, int end){
        if (start >= end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseAnArray(arr, start + 1, end - 1);
    }

}


