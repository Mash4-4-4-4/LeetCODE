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
    ArrayList<List<Integer>>result=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
             ArrayList<Integer>current=new ArrayList<>();
            int size=q.size();
            while(size-->0)
            { 
                TreeNode node=q.poll();
                current.add(node.val);
             if(node.left!=null)
             {
                  q.add(node.left);
             }
             if(node.right!=null)
             {
                 q.add(node.right);
             }
            }
            result.add(current);
        }
        return result;
    }
}