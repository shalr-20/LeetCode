class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String t = new StringBuilder(s).reverse().toString();
        return s.equals(t);
    }
}