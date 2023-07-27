/*
 * Problem Link : https://leetcode.com/problems/path-sum/?envType=study-plan-v2&envId=top-interview-150
 */

package binary_tree_general;

public class PathSum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root, 0, targetSum);
    }

    private boolean pathSum(TreeNode root, int previousSum, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null && (root.val + previousSum) == targetSum)
            return true;

        return pathSum(root.left, root.val + previousSum, targetSum) ||
            pathSum(root.right, root.val + previousSum, targetSum);
    }
}
