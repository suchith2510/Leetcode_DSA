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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        fit(root);
        return dia;
    }
    private int fit(TreeNode root){
        if(root==null) return 0;
        int l=fit(root.left);
        int r=fit(root.right);
        dia=Math.max(dia,l+r);
        return 1+Math.max(l,r);
    }
}