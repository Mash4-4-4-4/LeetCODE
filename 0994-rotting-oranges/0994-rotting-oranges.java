class Solution {
    int count=0;
    class Pair
    {
        int i;
        int j;
        Pair(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
    public int orangesRotting(int[][] grid) 
    {
       
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<n;j++)
           {
            if(grid[i][j]==2)
            {
              q.offer(new Pair(i,j));
            }
           }
        }
        bfs(grid,q);
                for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)return -1;
            }
        }
        return count;
    }
    void bfs(int grid[][],Queue<Pair>q)
    {
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(!q.isEmpty())
        {
            boolean changed=false;
            int k=q.size();
         for(int temp=0;temp<k;temp++)
        {
           Pair current=q.poll();
           int i=current.i;
           int j=current.j;
           for(int r=0;r<4;r++)
           {
              int newrow=i+dr[r];
              int newcol=j+dc[r];
              if(newrow>=0&&newrow<grid.length&&newcol>=0&&newcol<grid[0].length)
              {
                if(grid[newrow][newcol]==1)
                {
                    grid[newrow][newcol]=2;
                    q.offer(new Pair(newrow,newcol));
                    changed=true;
                }
              }
           }
        }
        if(changed)count++;
        }
        }
    }