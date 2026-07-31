class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) 
    {
        ArrayList<Integer>list=new ArrayList<>();
        int n=spells.length;
        int m=potions.length;
        Arrays.sort(potions);
        for(int i=0;i<n;i++)
        {
            int count=0;
            int low=0,high=m-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                long pro=(long)potions[mid]*spells[i];
                if(pro>=success)
                {
                count+=high-mid+1;
                high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            list.add(count);
        }
        int size=list.size();
        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=list.get(i);
        }
        return a;
    }
}