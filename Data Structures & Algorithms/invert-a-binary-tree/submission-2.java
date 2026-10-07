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


    public TreeNode invertTree(TreeNode root) {

        if(root == null)
        return root;

       //TreeNode ln =  invertTree(root.left);
       //TreeNode rn =  invertTree(root.right);

       root.left = invertTree(root.left);
       root.right = invertTree(root.right);

        TreeNode tn = null;
        tn = root.right;
        root.right = root.left;
        root.left = tn;

    return root==null? null : root;
        
        
    }   
}
