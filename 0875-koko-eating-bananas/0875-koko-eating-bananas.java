class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int low=1,high=Integer.MIN_VALUE;
        for(int i:piles)
        {
             high=Math.max(high,i);
        } 
        int ans=0;
        while(low<=high)
        {
            int hrs=0;
            int mid=low+(high-low)/2;
            for(int i:piles)
            {
                hrs+=Math.ceil((double)i/(double)mid);
            }
            if(hrs<=h)
            {
              high=mid-1;
                ans=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}