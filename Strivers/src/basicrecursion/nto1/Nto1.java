package basicrecursion.nto1;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNto1(number);
    }

    private static void printNto1(int n) {
        if (n <= 0) ;
        else {
            printNto1(n - 1);
            System.out.print(n + " ");
        }
    }
}
