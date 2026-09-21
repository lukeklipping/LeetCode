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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        
        traverse(root, out);
        return out;
    }

    public void traverse(TreeNode root, List<Integer> out){
        if(root != null){
            traverse(root.left, out);
            out.add(root.val);
            traverse(root.right, out);
        }
    }
}