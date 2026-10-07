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
        if(root == null)
        return 0;

        return Math.max(height(root.left)+1,height(root.right)+1);
    }

    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null)
        return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
    
        return  Math.max(lh+rh, leftDiameter+rightDiameter);
        

        // return Math.max(diameterOfBinaryTree(root.right) + 1,
        // diameterOfBinaryTree(root.left) + 1);


        
    }
}
