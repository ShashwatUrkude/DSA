class Solution {

    int maxele(int[] a)
    {
        int max = a[0];
        for(int i = 1; i < a.length ; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    long totalhours(int[] a, int speed)
    {
        long hours = 0;
        for(int i = 0 ; i < a.length ; i++)
        {
            hours += Math.ceil((double)a[i]/speed); 
        }
        return hours;
    }

    int binary(int[] a, int low, int high, int hours)
    {
        int ans = high;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if((long)totalhours(a,mid) <= hours)
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }

    public int minEatingSpeed(int[] piles, int h) 
    {
        return binary(piles,1,maxele(piles),h);
    }
}