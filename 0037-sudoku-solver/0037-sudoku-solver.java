class Solution {
    public void solveSudoku(char[][] board) 
    {
        helper(board);
    }
    boolean helper(char board[][])
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]=='.')
                {
             for(int num=1;num<=9;num++)
            {
            if(issafe(board,num,i,j))
            {
                board[i][j]=(char)(num+'0');
               if(helper(board))
               return true;
                board[i][j]='.';
            }
        }
        return false;
    }
    }
    }
    return true;
    }
    boolean issafe(char board[][],int num,int row,int col)
    {
       for(int i=0;i<board.length;i++)
       {
        if(board[i][col]==(char)(num+'0'))
        {
            return false;
        }
       }
       for(int j=0;j<board[0].length;j++)
       {
         if(board[row][j]==(char)(num+'0'))
        {
            return false;
        }
       }
       int startrow=row-row%3;
       int startcol=col-col%3;
       for(int i=startrow;i<startrow+3;i++)
       {
        for(int j=startcol;j<startcol+3;j++)
        {
            if(board[i][j]==(char)(num+'0'))
            {
                return false;
            }
        }
       }
       return true;

    }
}