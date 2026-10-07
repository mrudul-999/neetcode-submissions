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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> curLvl = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)return result;
        queue.add(root);
        queue.add(null);

        while(queue.size()>1)
        {
            TreeNode currn = queue.poll();

            if(currn == null)
            {
                result.add(new ArrayList<>(curLvl));
                curLvl.clear();
                queue.add(null);
            }else{
                curLvl.add(currn.val);
                if(currn.left!=null){queue.add(currn.left);}
                if(currn.right!=null){queue.add(currn.right);}
            }


        }
        
         result.add(curLvl);
        return result;

        
    }
}
