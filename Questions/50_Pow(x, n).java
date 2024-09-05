class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                x = 1 / x;
                n = Integer.MAX_VALUE;
                return x * myPow(x, n);
            }

            x = 1 / x;
            n = -n;
        }

        double res = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                res *= x;
            }

            x *= x;
            n /= 2;
        }

        return res;
    }
}
