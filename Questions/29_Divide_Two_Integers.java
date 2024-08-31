class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int res = 0;

        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int mul = 1;

            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                mul <<= 1;
            }

            absDividend -= tempDivisor;
            res += mul;
        }
        res = negative ? -res : res;

        return res;
    }
}