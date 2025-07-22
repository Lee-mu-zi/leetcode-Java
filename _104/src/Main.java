

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

    private int ans;

    public int maxDepth(TreeNode root) {
        dfs(root,0);
        return ans;
    }

    public void dfs(TreeNode node, int temp) {
        if (node == null) return;
        temp++;
        ans = Math.max(ans, temp);
        dfs(node.left, temp);
        dfs(node.right, temp);
    }
}