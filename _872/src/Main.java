import java.util.ArrayList;

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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        if (root1 != null) getLeaves(root1, list1);
        if (root2 != null) getLeaves(root2, list2);
        return list1.equals(list2);
    }

    private void getLeaves(TreeNode root, ArrayList<Integer> list) {
        if(root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            if(root.left != null) {
                getLeaves(root.left, list);
            }
            if(root.right != null) {
                getLeaves(root.right, list);
            }
        }
    }


}