class Solution {
    public boolean detectCapitalUse(String word) {
        String cap = word.toUpperCase();
        String nocap = word.toLowerCase();
        String onecap = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();

        if (word.equals(cap)) {
            return true;
        } else if (word.equals(nocap)) {
            return true;
        } else if (word.equals(onecap)) {
            return true;
        } else {
            return false;
        }
    }
}