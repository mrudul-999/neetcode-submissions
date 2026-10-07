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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null)
        return true;

        if(p!=null &&q!=null){
        int pv = p.val;
        int qv = q.val;

        boolean ls = isSameTree(p.left,q.left);
        boolean rs = isSameTree(p.right,q.right);

        if((pv == qv) && ls && rs)
        return true;
        else return false;
        }
        

        
        return false;
        
    }
}
