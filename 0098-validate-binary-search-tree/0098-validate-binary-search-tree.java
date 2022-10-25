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
    private long max=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) 
            return true;
        boolean isValid=isValidBST(root.left);
        
        if(root.val>max)
            max=root.val;
        else
            return false;
        
        return isValid && isValidBST(root.right);
    }
}