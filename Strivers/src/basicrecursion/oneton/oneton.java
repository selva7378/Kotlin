package basicrecursion.oneton;

import java.util.Scanner;

public class oneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        print1ton(num);
    }

    private static void print1ton(int num) {
        if (num <= 0 ) return;
        print1ton(num - 1);
        System.out.print(num + " ");
    }
}
