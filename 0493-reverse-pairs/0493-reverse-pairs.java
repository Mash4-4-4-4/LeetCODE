class Solution {
    int count=0;
    public int reversePairs(int[] nums) 
    {
        mergesort(nums,0,nums.length-1);
        return count;
    }
    void mergesort(int nums[],int low,int high)
    {
        int mid=low+(high-low)/2;
        if(low>=high)
        return;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        countpairs(nums,low,mid,high);
        merge(nums,low,mid,high);
    }
    void countpairs(int nums[],int low,int mid,int high)
    {
        int right=mid+1;
        for(int left=low;left<=mid;left++){
        while(right<=high&&nums[left]>2L*nums[right])
        {
            right++;
        }
         count+=right-(mid+1);
        }
    }
    void merge(int nums[],int low,int mid,int high)
    {
        ArrayList<Integer>list=new ArrayList<>();
      int left=low;
      int right=mid+1; 
      while(left<=mid&&right<=high)
      {
         if(nums[left]<=nums[right])
         {
            list.add(nums[left++]);
         }
         else
         {
            list.add(nums[right++]);
         }
      }
      while(left<=mid)
      {
        list.add(nums[left++]);
      }  
      while(right<=high)
      {
        list.add(nums[right++]);
      }
      for(int i=low;i<=high;i++)
      {
        nums[i]=list.get(i-low);
      }
    }
}