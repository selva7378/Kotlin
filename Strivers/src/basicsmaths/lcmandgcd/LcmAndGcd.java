package basicsmaths.lcmandgcd;

import java.util.Arrays;
import java.util.Scanner;

public class LcmAndGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(Arrays.toString(lcmAndGcd(a, b)));
    }

    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long gcd = gcd(A, B);
        long lcm = A * B / gcd;
        return new Long[] {lcm, gcd};
    }

    static long gcd(long a, long b) {
        while(a != b) {
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }
}
