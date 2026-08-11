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
    public void solve(char[][] board) 
    {
       Queue<Pair>q=new LinkedList<>();
       for(int i=0;i<board.length;i++)
       {
        for(int j=0;j<board[0].length;j++)
        {
            if((i==0||i==board.length-1||j==0||j==board[0].length-1)&&board[i][j]=='O')
            {
                board[i][j]='S';
                q.offer(new Pair(i,j));
            }
        }
       }
       int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
       while(!q.isEmpty())
       {
          Pair curr=q.poll();
          int i=curr.i;
          int j=curr.j;
          for(int d[]:dir)
          {
            int newrow=i+d[0];
            int newcol=j+d[1];
            if(newrow>=0&&newrow<board.length&&newcol>=0&&newcol<board[0].length){
            if(board[newrow][newcol]=='O')
            {
                q.offer(new Pair(newrow,newcol));
                board[newrow][newcol]='S';
            }
            }
          }
       }
        for(int i=0;i<board.length;i++)
       {
        for(int j=0;j<board[0].length;j++)
        {
            if(board[i][j]!='S')
            {
                board[i][j]='X';
            }
            else
            {
                board[i][j]='O';
            }
        }
       }
       
    }
}