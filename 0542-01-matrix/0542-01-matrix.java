class Solution {
    class Pairs
    {
        int i;
        int j;
        Pairs(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
    public int[][] updateMatrix(int[][] mat) 
    {
        Queue<Pairs>q=new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==0)
                {
                    q.offer(new Pairs(i,j));
                    mat[i][j]=0;
                }
                else
                {
                  mat[i][j]=-1;
                }
            }
        }
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        while(!q.isEmpty())
        {
            Pairs curr=q.poll();
            int i=curr.i;
            int j=curr.j;
           for(int d[]:dir)
           {
             int newrow=i+d[0];
             int newcol=j+d[1];
             if(newrow>=0&&newrow<mat.length&&newcol>=0&&newcol<mat[0].length&&mat[newrow][newcol]==-1)
             {
                mat[newrow][newcol]=mat[i][j]+1;
                q.offer(new Pairs(newrow,newcol));
             }
           }
        }
        return mat;

    }
}