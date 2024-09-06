class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(res, curr, nums, used);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> curr, int[] nums, boolean[] used) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            curr.add(nums[i]);

            backtrack(res, curr, nums, used);
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}