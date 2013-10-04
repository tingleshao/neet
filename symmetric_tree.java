/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if (root == null) {
            return true;
        }
        else {
            return isMirror(root.left, root.right);
        }
    }
    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null)
        {
            return true;
        }
        else {
            if (left == null || right == null) {
                return false;
            }
            else {
                if (left.val != right.val) {
                    return false;
                }
                else {
                    return isMirror(left.right, right.left) && isMirror(left.left, right.right);
                }
            }
        }
    }
}
