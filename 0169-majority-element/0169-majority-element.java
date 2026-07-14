class Solution {
    public int majorityElement(int[] nums) 
    {
        int count=1;
       int majele=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==majele)
            {
              count+=1;
            }
            else if(nums[i]!=majele)
            {
                count-=1;
            }
            if(count==0)
            {
                majele=nums[i];
                count=1;
            }
        }
        return majele;
    }
}