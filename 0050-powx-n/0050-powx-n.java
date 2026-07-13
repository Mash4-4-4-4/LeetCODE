class Solution {
    public double myPow(double x, int n) 
    {
        double ans=0.0;
      if(x==1.0||n==0)return 1.0;
      if(n<0){
      if(n==Integer.MIN_VALUE)return myPow(x*x,n/2);
      return myPow(1/x,-n);
      }
      if(n%2==0)
      {
        ans=myPow(x*x,n/2);
      }
      else
      {
        ans=x*myPow(x,n-1);
      }
      return ans;
    }
}