class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        int cand1=Integer.MIN_VALUE,count1=0;
        int cand2=Integer.MIN_VALUE,count2=0;
        for(int i:nums)
        {
            if(i!=cand1&&count2==0)
            {
                cand2=i;
                count2++;
            }
            else if(i!=cand2&&count1==0)
            {
                cand1=i;
                count1++;
            }
            else if(i==cand1)count1++;
            else if(i==cand2)count2++;
            else
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i:nums)
        {
            if(i==cand1)count1++;
            else if(i==cand2)count2++;
        }
        if(count1>nums.length/3)list.add(cand1);
        if(count2>nums.length/3)list.add(cand2);
        return list;
        
    }
}