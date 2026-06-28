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
    int index=0;
    int max=Integer.MAX_VALUE;
    int min=Integer.MIN_VALUE;
    public TreeNode bstFromPreorder(int[] preorder) 
    {
        TreeNode root=BST(preorder,max,min);
        return root;
    }
    TreeNode BST(int preorder[],int max,int min)
    {
        if(index==preorder.length)
        {
            return null;
        }
        if(preorder[index]<min||preorder[index]>max)
        return null;

        TreeNode curr=new TreeNode(preorder[index++]);
        curr.left=BST(preorder,curr.val,min); 
        curr.right=BST(preorder,max,curr.val);
        return curr;
    }
}