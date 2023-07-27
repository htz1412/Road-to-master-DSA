/*
 * Problem Link : https://leetcode.com/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150
 */

package binary_tree_general;

public class SameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag1 = p == null;
        boolean flag2 = q == null;

        if (flag1 == flag2) {
            if (p == null)
                return true;
            else if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }

        return false;
    }
}
