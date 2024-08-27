package basicsmaths.divisors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumOfDivisors(number));
    }

    static long sumOfDivisors(int N){
        long total = 0;
        for(int i = 1; i <= N; i++) {
            total += i * N / i;
        }
        return total;
    }
}
