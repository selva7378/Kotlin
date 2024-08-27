package basicsmaths.evenlydivides;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(evenlyDivides(number));
    }

    static int evenlyDivides(int N){
        // code here
        int dup = N;
        int count = 0;
        while(dup != 0) {
            int lastDigit = dup % 10;
            if(lastDigit == 0) {
                dup = dup / 10;
                continue;
            }
            if (N % lastDigit == 0) count++;
            dup = dup / 10;
        }
        return count;
    }
}
