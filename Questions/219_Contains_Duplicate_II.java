class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i])) {
                int j = h.get(nums[i]);
                if (i - j <= k) {
                    return true;
                }
            }

            h.put(nums[i], i);
        }
        return false;
    }
}