class Solution {
    public int longestSubarray(int[] nums) 
    {
     int l=0,r=0,zero=0,maxlen=0;
     while(r<nums.length)
     {
        if(nums[r]==0)
        {
            zero++;
        }
        while(zero>1)
        {
            if(nums[l]==0)zero--;
            l++;
        }
        maxlen=Math.max(maxlen,r-l);
        r++;
     }   
     return maxlen;
    }
}