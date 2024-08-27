package basicsmaths.armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(armstrongNumberOrNot(number));
    }

    public static boolean armstrongNumberOrNot(int number) {
        int dupNumber = number;
        double total = 0;
        int numberOfDigits = (int) (Math.log10(number) + 1);
        while(dupNumber != 0) {
            int lastDigit = dupNumber % 10;
            total += Math.pow(lastDigit, numberOfDigits);
            dupNumber /= 10;
        }
        return number == (int)total;
    }
}
