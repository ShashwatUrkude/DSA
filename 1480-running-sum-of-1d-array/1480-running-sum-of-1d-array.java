class Solution {
    public int[] runningSum(int[] nums) 
    {
        int[] runsum = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            runsum[i] = sum;
        }
        return runsum;
    }
}