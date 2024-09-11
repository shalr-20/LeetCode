// Approach -1
class Solution {
    public char findTheDifference(String s, String t) {

        int[] charCount = new int[26]; // 26 letters in the alphabet

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            charCount[c - 'a']--;

            if (charCount[c - 'a'] < 0) {
                return c;
            }
        }

        // This point should never be reached due to constraints
        return ' ';
    }
}