class Solution {//first zero apperanece
    public void moveZeroes(int[] nums) 
    {
        int n=nums.length;
        int l=0;
        while(l<n&&nums[l]!=0)l++;
        int r=l+1;
        while(r<n)
        {
          if(nums[r]!=0)
          {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
          }
          r++;
        }
    }
}