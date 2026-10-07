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

    int height(TreeNode root)
    {
        if(root == null)return 0;

        return Math.max(height(root.left)+1,height(root.right)+1);
    }

    public boolean isBalanced(TreeNode root) {


       if(root == null) return true;

        int rh = height(root.right);
        int lh = height(root.left);

       boolean rightres =  isBalanced(root.right);
       boolean leftres =  isBalanced(root.left);

        if(Math.abs(rh-lh)<=1 && rightres && leftres)return true;
        else return false;
       

    }
}
