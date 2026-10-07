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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();


        if(root!=null)
        {
            q.add(root);
        }


        while(!q.isEmpty())
        {
            TreeNode rightmost = null;
            TreeNode element = null;
            int size = q.size();

            for(int i=0;i<size;i++)
            {
                element = q.poll();
                rightmost = element;
                if(rightmost.left!=null)q.add(rightmost.left);
                if(rightmost.right!=null)q.add(rightmost.right);
            }
            res.add(rightmost.val);
        }

        return res;




        
    }
}
