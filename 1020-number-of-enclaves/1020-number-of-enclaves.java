class Solution {
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
    public int numEnclaves(int[][] grid) 
    {
        int count=0;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if((i==0||i==grid.length-1||j==0||j==grid[0].length-1)&&grid[i][j]==1)
                {
                    grid[i][j]=-1;
                    q.offer(new Pair(i,j));
                }
            }
        }
        int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty())
        {
            Pair curr=q.poll();
            int row=curr.i;
            int col=curr.j;
            for(int d[]:dir)
            {
                int newrow=row+d[0];
                int newcol=col+d[1];
                if((newrow>=0&&newrow<grid.length&&newcol>=0&&newcol<grid[0].length)&&grid[newrow][newcol]==1)
                {
                    q.offer(new Pair(newrow,newcol));
                    grid[newrow][newcol]=-1;
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                }

            }
        }
        return count;
    }
}