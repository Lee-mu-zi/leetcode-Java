public class Main {
    public static void main(String[] args) {
        int[] root = {10, 4, 6};
        Solution solution = new Solution();
    }
}


class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;

    }
}

 class TreeNode {
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
