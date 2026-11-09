class Solution 
{
    public int jump(int[] nums) 
    {
        int count = 0;
        int i = 0;

        for(; i < nums.length - 1; )
        {
            int max = 0;
            int index = i;

            if(i + nums[i] >= nums.length - 1)
            {
                count++;
                break;
            }

            for(int j = i + 1; j <= i + nums[i] && j < nums.length; j++)
            {
                if(j + nums[j] > max)
                {
                    max = j + nums[j];
                    index = j;
                }
            }

            i = index;
            count++;
        }

        return count;
    }
}