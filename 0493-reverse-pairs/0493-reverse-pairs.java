class Solution {

    void merge(int[] a , int low, int mid, int high)
    {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left <= mid && right<=high)
        {
            if(a[left] <= a[right])
            {
                temp.add(a[left]);
                left++;
            }
            else
            {
                temp.add(a[right]);
                right++;
            }
        }

        while(left <= mid)
        {
            temp.add(a[left]);
            left++;
        }

        while(right <= high)
        {
            temp.add(a[right]);
            right++;
        }

        for(int i = low ; i <= high ;i++)
        {
            a[i] = temp.get(i - low);
        }
    }

    int countpairs(int[] a,int low,int mid,int high)
    {
        int left = low;
        int right = mid+1;
        int count = 0;
        for(int i = left ; i <= mid ; i++)
        {
            while(right<=high && (long)a[i] > 2L * a[right])
            {
                right++;
            }
            count += right-(mid+1);
        }
        return count;
    }

    int mergeSort(int[] a , int low,int high)
    {
        int count = 0;

        if(low >= high) return count;
        int mid = (low+high) / 2;
        count += mergeSort(a,low,mid);
        count += mergeSort(a,mid+1,high);
        count += countpairs(a,low,mid,high);
        merge(a,low,mid,high);
        return count;
    }

    public int reversePairs(int[] nums) 
    {
        return mergeSort(nums,0,nums.length-1);
    }
}