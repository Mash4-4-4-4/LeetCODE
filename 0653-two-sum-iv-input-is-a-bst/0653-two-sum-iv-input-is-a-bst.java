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
    ArrayList<Integer>list=new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) 
    {
       return hasNode(root,k);
    }
    boolean hasNode(TreeNode root,int k)
    {
      if(root==null)
      {
        return false;
      }
      int sum=k-root.val;
     if(list.contains(sum))
     {
       return true;
     }
     list.add(root.val);
     return hasNode(root.left,k)||hasNode(root.right,k);
    }
}