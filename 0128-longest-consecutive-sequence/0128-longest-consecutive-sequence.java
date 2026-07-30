import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int lastmin = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        for(int i = 0 ; i < nums.length; i++ )
        {
            if(nums[i] - 1 == lastmin)
            {
                count +=1;
                lastmin = nums[i];
            }
            else if(nums[i] != lastmin)
            {
                count = 1;
                lastmin = nums[i];
            }

            longest = Math.max(longest,count);
        }
        return longest;
    }
}