class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length ; i++)
        {
            if(count1 == 0 && nums[i] != ele2)
            {
                count1 = 1;
                ele1 = nums[i];
            }
            else if(count2 == 0 && ele1 != nums[i])
            {
                count2 = 1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i])
            {
                count1++;
            }
            else if(ele2 == nums[i])
            {
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(ele1 == nums[i])
            {
                cnt1++;
            }
            if(ele2 == nums[i])
            {
                cnt2++;
            }
        }
        int mini = (int)(nums.length/3) +1 ;
        if(cnt1 >= mini)
        {
            ans.add(ele1);
        }
        if(ele1 != ele2 && cnt2 >= mini)
        {
            ans.add(ele2);
        }
        return ans;
    }
}