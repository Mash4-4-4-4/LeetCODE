class Solution {
    ArrayList<List<String>>result=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) 
    {
        char matrix[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
        for(int j=0;j<n;j++)
        {
          matrix[i][j]='.';  
        }
    }
    helper(matrix,0,n);
    return result;
   }
    void helper(char matrix[][],int i,int n)
    {
        if(i>n-1)
        {
            saveboard(matrix);
            return;
        }
        for(int j=0;j<n;j++)
        {
           if(isafe(matrix,i,j))
           {
             matrix[i][j]='Q';
             helper(matrix,i+1,n);
             matrix[i][j]='.';
           }
        }       
    }
    boolean isafe(char matrix[][],int row,int col)
    {
        for(int i=0;i<matrix.length;i++){
         if(matrix[i][col]=='Q')
            return false;
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
         if(matrix[i][j]=='Q')
            return false;
        }
          for(int i=row-1,j=col+1;i>=0&&j<matrix.length;i--,j++){
         if(matrix[i][j]=='Q')
            return false;
        }
         return true;
    }
    void saveboard(char matrix[][])
    {
        ArrayList<String>current=new ArrayList<>();
      for(int i=0;i<matrix.length;i++)
      {
       current.add(new String(matrix[i]));
      }
        result.add(current);
    }
}