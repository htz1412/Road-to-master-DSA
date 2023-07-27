/*
 * Problem Link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/?envType=study-plan-v2&envId=top-interview-150
 */

public class ConvertSortedArrayToBinarySearchTree {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = buildBST(nums, start, mid - 1);
            node.right = buildBST(nums, mid + 1, end);
            return node;
        }

        return null;
    }
}
