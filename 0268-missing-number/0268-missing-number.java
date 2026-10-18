class Solution {
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sumcount = 0;
        for(int i = 0; i < n; i++)
        {
            sumcount = sumcount + nums[i];
        }
        return sum - sumcount;
    }
}