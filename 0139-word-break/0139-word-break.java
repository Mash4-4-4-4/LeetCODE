class Solution {
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        int max=0;
        HashSet<String>set=new HashSet<>();
        for(String s1:wordDict)
        {
            set.add(s1);
            max=Math.max(max,s1.length());
        }
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<dp.length;i++)
        {
          for(int j=1;j<=max&&j<=i;j++)
          {
            if(!dp[i-j])
            {
                continue;
            }
            String word=s.substring(i-j,i);
            if(set.contains(word))
            {
                dp[i]=true;
                break;
            }
          }
        }
        return dp[dp.length-1];
    }
    
}