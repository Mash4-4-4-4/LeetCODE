class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) 
    {
        dp=new int[m][n];
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            dp[i][j]=-1;
        }
       }
       return backtrack(0,0,m,n);    
    }
    int backtrack(int row,int col,int m,int n)
    {
       if(row>m-1||col>n-1)
       {
        return 0;
       }
       if(row==m-1&&col==n-1)
       {
         return 1;
       }
       if(dp[row][col]!=-1)
       {
        return dp[row][col];
       }
       int right=backtrack(row,col+1,m,n);
       int down=backtrack(row+1,col,m,n);
       int total=right+down;
       dp[row][col]=total;
       return dp[row][col];
    }

}