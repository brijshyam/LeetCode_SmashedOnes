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
        List<Integer> list = new LinkedList<Integer> ();
        if(root== null )
            return list;
        inOrderHelper( root, list);
        
        return list;
    }
    
    public void inOrderHelper(TreeNode root, List<Integer> list){
        if(root==null)
            return ;
        inOrderHelper(root.left, list);
        list.add(root.val);
        inOrderHelper(root.right, list);
        
        return;
    }
}