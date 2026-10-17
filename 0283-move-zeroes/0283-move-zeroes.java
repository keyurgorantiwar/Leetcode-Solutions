class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int[] numbers = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            numbers[j] = nums[i];
            if(nums[i] == 0)
            {
                continue;
            }
            else
            {
                j++;
            }
        }
        for(int i = j; i<nums.length; i++)
        {
            numbers[i] = 0;
        }

        for(int i = 0; i<nums.length; i++)
        {
            nums[i] = numbers[i];
        }
    }
}