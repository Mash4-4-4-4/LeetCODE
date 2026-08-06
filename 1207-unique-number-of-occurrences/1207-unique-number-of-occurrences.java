class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
         HashMap<Integer,Integer>map=new HashMap<>();
         HashSet<Integer>h1=new HashSet<>();
         for(int i:arr)
         {
            if(!map.containsKey(i))map.put(i,1);
            else
            map.put(i,map.get(i)+1);
         }
         for(int key:map.keySet())
         {
            if(h1.contains(map.get(key)))return false;
            else h1.add(map.get(key));
         }
         return true;
    }
}