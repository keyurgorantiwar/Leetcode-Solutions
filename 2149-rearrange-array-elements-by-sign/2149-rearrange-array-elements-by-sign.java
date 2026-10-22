class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int count = 0; 
        int j = 0;
        int k = 0;
        int a = 0;
        int b = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                count++;
            }
        }

        int[] numbersn = new int[count];
        int[] numbersp = new int[nums.length - count];

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                numbersn[j] = nums[i];
                j++;
            }
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                numbersp[k] = nums[i];
                k++;
            }
        }

        for(int i = 0; i < nums.length; i += 2)
        {
            nums[i] = numbersp[a];
            a++;
            nums[i+1] = numbersn[b];
            b++;
        }
        
        return nums;
    }
}