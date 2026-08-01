class Solution {
    public int pivotIndex(int[] nums) 
    {
        int sum = nums[0];
        for(int i = 1 ; i<nums.length ; i++)
        {
            sum += nums[i];
        }
        int prefix = 0;
        int suffix = 0;
        for(int i = 0;i < nums.length ;i++)
        {
            suffix = sum - prefix - nums[i];

            if(prefix == suffix)
            {
                return i;
            }

            prefix += nums[i];
        }
        return -1;
    }
}