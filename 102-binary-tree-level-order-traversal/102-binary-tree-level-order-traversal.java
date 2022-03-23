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
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
           List<Integer>  lst = new ArrayList<>();
        if(root==null)return ans;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
          TreeNode front = q.remove();
            if(front==null){
                if(!q.isEmpty()){
                  q.add(null);
                  }
                 ans.add(lst);
                lst = new ArrayList<>();
            }else{
                lst.add(front.val);
                if(front.left!=null){
                    q.add(front.left);
                }
                if(front.right!=null){
                    q.add(front.right);
                }
            }
        }
        return ans;
    }
}