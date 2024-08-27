package basicrecursion.sumofseries;

import java.util.Random;

public class SumOfSeries {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Random rand = new Random();
            Long num = rand.nextLong(i);
            System.out.printf("%d = %-15s%d \n",num, "sum of series ", sumOfSeries(num));
        }
    }

    private static Long sumOfSeries(Long num) {
        if (num <= 0) return 0L;
        return num + sumOfSeries(num - 1);
    }
}
