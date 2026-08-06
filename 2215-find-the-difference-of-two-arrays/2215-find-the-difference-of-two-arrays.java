class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        ArrayList<List<Integer>>list=new ArrayList<>();
        HashSet<Integer>h1=new HashSet<>();
        HashSet<Integer>h2=new HashSet<>();
        for(int i:nums1)
        {
            if(!h1.contains(i))h1.add(i);
        }
         for(int i:nums2)
        {
            if(!h2.contains(i))h2.add(i);
        }
        ArrayList<Integer>current=new ArrayList<>();
         ArrayList<Integer>current2=new ArrayList<>();
        for(int i:h1)
        {
            if(!h2.contains(i))
            {
                current.add(i);
            }
        }
         list.add(current);
         for(int i:h2)
        {
            if(!h1.contains(i))
            {
                current2.add(i);
            }
        }
         list.add(current2);
         return list;
    }
}