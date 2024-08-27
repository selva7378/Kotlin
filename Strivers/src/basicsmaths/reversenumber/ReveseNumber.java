package basicsmaths.reversenumber;

public class ReveseNumber {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverse(1534236469));
    }
}



class Solution {
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