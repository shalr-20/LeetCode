import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seenNum = new HashSet<>();
        while (n != 1 && !seenNum.contains(n)) {
            seenNum.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}