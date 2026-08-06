class Solution {
    class Pair
    {
        int i;int j;
         Pair(int i,int j)
         {
            this.i=i;
            this.j=j;
         }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {

        bfs(image,sr,sc,color);
        return image;
    }
    void bfs(int image[][],int sr,int sc,int color)
    {
        int original=image[sr][sc];
        if(original==color)return;
        image[sr][sc]=color;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(sr,sc));
        while(!q.isEmpty())
        {
            int size=q.size();
            Pair curr=q.poll();
            int row=curr.i;
            int col=curr.j;
           for(int i=0;i<4;i++)
           {
            int newrow=row+dr[i];
            int newcol=col+dc[i];
            if(newrow>=0&&newrow<image.length&&newcol>=0&&newcol<image[0].length)
            {
                if(image[newrow][newcol]==original)
                {
                    image[newrow][newcol]=color;
                    q.offer(new Pair(newrow,newcol));
                }
            }
           }
        }
    }
}                   