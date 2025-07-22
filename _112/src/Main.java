
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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

class Solution {

    private boolean ans = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, 0);
        return ans;
    }

    public void dfs(TreeNode node, int targetSum, int sum) {
        if (node == null) return;
        sum += node.val;
        if(node.left == null && node.right == null && targetSum == sum) {
            ans = true;
        }
        dfs(node.left, targetSum, sum);
        dfs(node.right, targetSum, sum);
    }
}