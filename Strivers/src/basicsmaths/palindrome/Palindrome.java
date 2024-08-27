package basicsmaths.palindrome;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(new Palindrome().isPalindrome(number));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
       long reverseNumber = reverse(x);
       return x == reverseNumber;
    }


    public long reverse(int x) {
        long res = 0;
        while(x != 0) {
            int lastDigit = x % 10;
            res = res * 10 + lastDigit;
            x /= 10;
        }
        if(res >= Math.pow(-2,31) && res <= Math.pow(2,31)){
            return res;
        }

        return 0;
    }
}
