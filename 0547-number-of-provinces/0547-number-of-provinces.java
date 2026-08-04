class Solution {
    public int findCircleNum(int[][] isConnected) 
    {
        int count=0;
        int n=isConnected.length;
        boolean  visited[]=new boolean[n];
       for(int city=0;city<n;city++)
       {
         if(!visited[city]){
         Dfs(isConnected,visited, city);
         count++;
         }
       }
       return count;
    }
    void Dfs(int [][]isConnected,boolean visited[],int start)
    {
        Queue<Integer>q=new LinkedList<>();
        q.offer(start);
        visited[start]=true;
        while(!q.isEmpty())
        {
           int city=q.poll();
            for(int neigh=0;neigh<isConnected.length;neigh++)
            {
                if(isConnected[city][neigh]==1&&visited[neigh]!=true)
                {
                    visited[neigh]=true;
                    q.offer(neigh);
                }
                
            }
        }
    }
}