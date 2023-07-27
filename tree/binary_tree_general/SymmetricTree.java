/*
 * Problem Link : https://leetcode.com/problems/symmetric-tree/?envType=study-plan-v2&envId=top-interview-150
 */

package binary_tree_general;

public class SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftRoot, TreeNode rightRoot) {
        if (leftRoot == null && rightRoot == null) {
            return true;
        }

        if (leftRoot == null || rightRoot == null) {
            return false;
        }

        return leftRoot.val == rightRoot.val && isMirror(leftRoot.left, rightRoot.right) && isMirror(leftRoot.right, rightRoot.left);
    }
}
