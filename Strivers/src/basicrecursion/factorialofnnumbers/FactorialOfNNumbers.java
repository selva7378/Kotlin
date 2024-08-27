package basicrecursion.factorialofnnumbers;

import java.util.ArrayList;

public class FactorialOfNNumbers {
    public static void main(String[] args) {
        ArrayList<Long> res = factorialNumbers(2);
        System.out.println(res);
    }

    static ArrayList<Long> res = new ArrayList();
    static long origNum = 0;

    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        origNum = n;
        factorial(n);
        return res;
    }

    static Long factorial(long n) {
        if (n <= 0) return 1L;
        long fact = n * factorial(n - 1);
        if(fact <= origNum){
            res.add(fact);
        }
        return fact;
    }
}
