
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    private boolean ans = true;

    public boolean isUnivalTree(TreeNode root) {
        dfs(root, root.val);
        return ans;
    }

    public void dfs(TreeNode node, int lastValue) {
        if (node == null) return;
        ans = lastValue == node.val;
        dfs(node.left, lastValue);
        dfs(node.right, node.val);
    }
}