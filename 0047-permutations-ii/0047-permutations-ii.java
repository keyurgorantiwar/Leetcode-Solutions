class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        backtrack(nums, new ArrayList<>(), used, ans);

        return ans;
    }

    public void backtrack(int[] nums, List<Integer> temp,
                          boolean[] used, List<List<Integer>> ans) {

        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            temp.add(nums[i]);
            used[i] = true;

            backtrack(nums, temp, used, ans);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}