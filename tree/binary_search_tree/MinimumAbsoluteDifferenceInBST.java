/*
 * Problem Link : https://leetcode.com/problems/minimum-absolute-difference-in-bst/?envType=study-plan-v2&envId=top-interview-150
 */

package binary_search_tree;

public class MinimumAbsoluteDifferenceInBST {
    Integer minDiff = Integer.MAX_VALUE, prev = null;

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

    public int getMinimumDifference(TreeNode root) {
        if (root.left != null) getMinimumDifference(root.left);

        if (prev != null) minDiff = Math.min(minDiff, root.val - prev);
        prev = root.val;

        if (root.right != null) getMinimumDifference(root.right);

        return minDiff;
    }
}
