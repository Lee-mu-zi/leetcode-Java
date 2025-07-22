import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int numColor(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        getCount(root, set);
        return set.size();
    }

    private void getCount(TreeNode node, HashSet set) {
        if (node == null) return;
        set.add(node.val);
        getCount(node.left, set);
        getCount(node.right, set);
    }
}