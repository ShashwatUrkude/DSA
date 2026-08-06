
class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int left = 0;
        int right = nums.length - 1;
        int k = right;

        int[] ans = new int[nums.length];

        while(left<=right)
        {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if(leftsq > rightsq)
            {
                ans[k--] = leftsq;
                left++;
            }
            else
            {
                ans[k--] = rightsq;
                right--;
            }
        }
        return ans;
    }
}