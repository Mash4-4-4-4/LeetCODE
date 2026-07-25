class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        int n=nums.length;
       int i=0,j=0,k=0,l=0;
       Arrays.sort(nums);
       ArrayList<List<Integer>>result=new ArrayList<>();
       while(i<n-3)
       {
         if(i>0&&nums[i]==nums[i-1])
         {
            i++;
            continue;
         }
         for(j=i+1;j<n-2;j++)
         {
            if(j>i+1&&nums[j]==nums[j-1])continue;
            k=j+1;
            l=n-1;
            while(k<l){
        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
           if(sum==target)
           {
            result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
            while(k<l&&nums[k]==nums[k+1])k++;
            while(l>k&&nums[l]==nums[l-1])l--;
            k++;
            l--;
           }
            else if(sum>target)l--;
            else if(sum<target)k++;
           }
         }
           i++;
         }  
       return result;
    }
}