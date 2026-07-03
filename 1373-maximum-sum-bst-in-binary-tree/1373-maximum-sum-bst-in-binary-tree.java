/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class info
    {
        boolean isBst;
        int min;
        int max;
        int sum;
         info(boolean isBst,int min,int max,int sum)
        {
            this.isBst=isBst;
            this.min=min;
            this.max=max;
            this.sum=sum;
        }
    }
    int ans=0;
    public int maxSumBST(TreeNode root) 
    {
        postorder(root);
        return ans;
    }
    info postorder(TreeNode root)
    {
        if(root==null)
        {
            return new info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        }
        info left=postorder(root.left);
        info right=postorder(root.right);
        if(left.isBst&&right.isBst&&root.val>left.max&&root.val<right.min)
        {
            int sum=left.sum+right.sum+root.val;
            ans=Math.max(ans,sum);

           int min=Math.min(root.val,left.min);
           int max=Math.max(root.val,right.max);
           return new info(true,min,max,sum);
        }
        return new info(false,0,0,0);

    }
}