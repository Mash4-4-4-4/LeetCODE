class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) 
    {
        if(beginWord.length()!=endWord.length())return 0;
        HashSet<String>set=new HashSet<>(wordList);
        Queue<String>q=new LinkedList<>();
        q.offer(beginWord);
        int count=1;
        Queue<String>visited=new LinkedList<>();
         while(!q.isEmpty())
         {
            int size=q.size();
            for(int i=0;i<size;i++){
            String curr=q.poll();
            if(curr.equals(endWord))return count;
            for(int j=0;j<curr.length();j++)
            {
                for(int k='a';k<='z';k++)
                {
                    char ch[]=curr.toCharArray();
                    ch[j]=(char)k;
                    String s=new String(ch);
                    if(set.contains(s)&&!visited.contains(s))
                    {
                        q.add(s);
                        visited.add(s);
                    }
                }
            }
         }
         count++;
         }
         return 0;    
    }

}