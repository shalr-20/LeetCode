class Solution {
    public int singleNumber(int[] nums) {
        int res1 = 0, res2 = 0;

        for (int i = 0; i < nums.length; i++) {
            res2 |= res1 & nums[i];
            res1 ^= nums[i];

            int c_b = res1 & res2;

            res1 &= ~c_b;
            res2 &= ~c_b;
        }
        return res1;
    }
}