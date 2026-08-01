class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int strow = 0;
        int stcol = 0;
        int endrow = n-1;
        int endcol = m-1;

        while(strow <= endrow && stcol <= endcol)
        {
            for(int i = stcol ; i <= endcol ; i++)
            {
                ans.add(matrix[strow][i]);
            }
            strow++;

            for(int i = strow ; i <= endrow ; i++)
            {
                ans.add(matrix[i][endcol]);
            }
            endcol--;

            if(strow <= endrow)
            {
                for(int i = endcol; i >= stcol ; i--)
                {
                    ans.add(matrix[endrow][i]);
                }
                endrow--;
            }

            if(stcol <= endcol)
            {
                for(int i = endrow ; i >= strow ; i--)
                {
                    ans.add(matrix[i][stcol]);
                }
                stcol++;
            }
        }
        return ans;
    }
}