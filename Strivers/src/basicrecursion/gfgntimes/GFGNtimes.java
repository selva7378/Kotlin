package basicrecursion.gfgntimes;

import java.util.Scanner;

public class GFGNtimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printGFGNtimes(number);
    }

    private static void printGFGNtimes(int num){
        if (num == 0) return;
        System.out.print("GFG ");
        printGFGNtimes(num - 1);
    }
}
