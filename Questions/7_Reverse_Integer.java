class Solution {
    public int reverse(int x) {
        int res = 0;
        boolean isNeg = x < 0;
        String a = String.valueOf(Math.abs(x));
        StringBuilder ab = new StringBuilder(a).reverse();

        try {
            res = Integer.parseInt(ab.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return isNeg ? -res : res;
    }
}