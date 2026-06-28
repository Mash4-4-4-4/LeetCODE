/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    ArrayList<TreeNode>list1=new ArrayList<>();
    ArrayList<TreeNode>list2=new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        lca(root,list1,p);
        lca(root,list2,q);
        int min=Math.min(list1.size(),list2.size());
        TreeNode ans=root;
        for(int i=1;i<min;i++)
        {
            if(list1.get(i)!=list2.get(i))
            {
                break;
            }
            else
            {
                ans=list1.get(i);
            }
        }
        return ans;
    }
    ArrayList<TreeNode> lca(TreeNode root,ArrayList<TreeNode>list,TreeNode p)
    {
        if(root==null)
        {
            return null;
        }
        list.add(root);
        if(root.left==null&&root.right==null&&root.val!=p.val)
        {
            list.remove(list.size()-1);
        }
        if(root.val==p.val)
        {
            return list;
        }
        if(root.val>p.val)
        {
            return lca(root.left,list,p);
        }
        if(root.val<p.val)
        {
            return lca(root.right,list,p);
        }
        return list;
    }
}