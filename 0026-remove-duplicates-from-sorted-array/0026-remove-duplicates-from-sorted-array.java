class Solution 
{
    public int removeDuplicates(int[] nums) 
    {   
        if (nums.length == 0)
        {
            return 0;
        }

        int [] arr = new int[nums.length];
        arr[0] = nums[0];
        int j = 0;
        for(int i = 1; i < nums.length; i++)
        {
           if(arr[j] != nums[i])
           {
                j++;
                arr[j] = nums[i];
           }
        }

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = arr[i];
        }
        return j + 1;
    }
}